package search;

import java.util.Scanner;
import java.io.*;

public class Menu
{

	public static void main(String[] args) throws IOException
	{

		//Allows the user enter in informations
			Scanner console = new Scanner(System.in);

		//Switch Statement that calls the Runner method or ends the program
		int choice = 0;

		System.out.println("Welcome to my index, choose to Search(1) or Exit(2) the Programme: ");
		choice = console.nextInt();

		switch(choice)
		{
			case 1:
					System.out.println("Search: ");
					Runner x = new Runner();
					break;
			case 2:
					System.out.println("Exit: ");
		}//switch


	}//main

}//Menu
