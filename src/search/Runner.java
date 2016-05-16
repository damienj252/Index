package search;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner
{

	public static void main(String[] args) throws IOException
	{
		//This allows the user enter in text into the CMD
		Scanner console = new Scanner(System.in);

		String filename = "WarAndPeace-LeoTolstoy.txt";

		Map<String, WordDetail> pageIndices = new FileReader().parse(filename);



		//This is the code outputed to the CMD and also reads in the word inputed from the user
		System.out.print("Enter word: ");
		String word = console.nextLine();

		//The word becomes case insensitive
		word = word.toLowerCase();

		//These output to the CMD while calling the getDef and getIndices methods
		System.out.println("Definition: " + pageIndices.get(word).getDef());

		System.out.println("Page indices: " + "," + pageIndices.get(word).getIndices());

	}//main

}//Runner

