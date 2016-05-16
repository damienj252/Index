package search;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class IgnoreReader 
{
	private Set<String> ignoreWords = new TreeSet<String>();
		
		//If the user enters in a wrong word this is will throw an exception to save the file from crashing
		public Set<String> getWords() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("stopwords.txt")));
			
			//Gives the String line the value of null
			String line = null;
			
			//While loop - Read every line from file until the file ends
			while ((line = br.readLine()) != null)
			{
				ignoreWords.add(line);
			}
			
			return ignoreWords;
		}//public Set<String>
		
}//IngoreReader
