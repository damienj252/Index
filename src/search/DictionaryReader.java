package search;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DictionaryReader
{
	//Private map that is only read in the DictionaryReader class
	private Map<String, String> dictionary = new HashMap<String, String>();

	//
	public Map<String, String> getDictionary() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dictionary.csv")));

		String line = null;

		//While Loop - Read every line of the file until the end of file
		while((line = br.readLine()) != null)
		{
			line = line.substring(1);

			//This String will split the words between a \ and a ,
			String word = line.split("\",")[0];

			//This will allow the word to be both uppercase and lowercase
			word = word.toLowerCase();

			//This puts the word(definition) first then the line(explanation)
			dictionary.put(word, line);

		}//while loop

		return dictionary;
	}//throws
}//DictionaryReader
