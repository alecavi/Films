package main;

/**
 * @author Alessandro Cavicchioli
 * @version 1.0
 */
public class Menu
{
	private Collection collection;
	
	/**
	 * Default constructor
	 */
	Menu()
	{
		this.collection = new Collection();
	}
	
	/**
	 * Menu function to display the collection. Equivalent to collection.displayFilmDetails()
	 */
	public void displayCollection()
	{
		collection.displayFilmDetails();
	}
	
	public void setFilmDetails(String filmTitle)
	{
		collection.searchFilm(filmTitle);
	}
	
	public static void main(String[] args) //Professor-approved. Do not move
	{
		Menu menu = new Menu();
	}
	
}
