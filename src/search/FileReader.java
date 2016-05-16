package search;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class FileReader 
{
	
	private Map<String, WordDetail> pageIndices = new HashMap<String,WordDetail>();

	public Map<String, WordDetail> parse(String filename) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		Map<String, String> dictionary = new DictionaryReader().getDictionary();
		Set<String> ignoreWords = new IgnoreReader().getWords();
		int page = 1;
		int lineCount = 0;
		String line = null;
		
		// Read every line from file, till end of file
		while ((line = br.readLine()) != null)
		{
			lineCount++;
			if(lineCount % 40 == 0)
			{
				page++;
				lineCount = 0;
			}//if
			
			String [] words = line.split(" ");
			
			for(int i=0; i<words.length; i++)
			{
				if(ignoreWords.contains(words[i]))
				{
					continue;
				}//if
				
				if(pageIndices.containsKey(words[i]))
				{
					WordDetail wd = pageIndices.get(words[i]);
					if (wd.getIndices().contains(page))
					{
						continue;
					}//if
					else
					{
						wd.addIndex(page);
					}//if
				}//if
				else
				{
					WordDetail wd;
					if (dictionary.get(words[i]) == null)
					{
						wd = new WordDetail("undefined");
					}//if
					else 
					{
						wd = new WordDetail(dictionary.get(words[i]));
					}//else
	
					wd.addIndex(page);
					
					pageIndices.put(words[i], wd);
				}//else
			}//for
		}//while
		return pageIndices;
	}//public

}//FileReader
