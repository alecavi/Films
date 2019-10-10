package main;

import java.util.Scanner;

/**
 * Stores a list of Films
 * @author Alessandro Cavicchioli
 * @version 1.0
 */
public class Collection
{
	Film[] films = new Film[3];
	
	/**
	 * Default constructor. Creates the actual film objects in the collection array.
	 */
	Collection()
	{
		for(int i=0; i<3; i++)
		{
			films[i] = new Film();
		}
	}
	
	/**
	 * Prompts the user to input the details of all films in the collection, and sets them
	 */
	public void setFilmsDetails()
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Setting film " + i + ":");
			System.out.println("Input title");
			films[i].setTitle(scan.nextLine());
			System.out.println("Input director name");
			films[i].setDirector(scan.nextLine());
			System.out.println("Input duration in minutes");
			films[i].setDuration(scan.nextInt());
			System.out.println("Input cost");
			films[i].setCost(scan.nextFloat());
			System.out.println();
		}
		scan.close();
	}
	
	/**
	 * Displays the details of all films in the collection.
	 */
	public void displayFilmDetails()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Displaying film " + i + ":");
			films[i].displayDetails();
			System.out.println();
		}
	}
	
	/**
	 * Searches the collection for films with the specified title, and displays their details if one or more are found
	 * @param title The title to look for
	 */
	public void searchFilm(String title)
	{
		for(int i=0; i<3; i++)
		{
			if(films[i].getTitle().equals(title))
			{
				films[i].displayDetails();
			}
		}
	}
}