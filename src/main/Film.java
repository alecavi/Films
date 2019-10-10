package main;

/**
 * Represents a single film
 * 
 * @author Alessandro Cavicchioli
 * @version 1.0
 *
 */
public class Film
{
	private String title;
	private String director;
	private int duration;
	private double cost;
	
	/**
	 * Default constructor. Initialises all strings to "" and all numbers to 0
	 */
	Film()
	{
		title = "";
		director = "";
		duration = 0;
		cost = 0;
	}
	
	/**
	 * Create film constructor. Initialises the parameters to what was passed by the user by calling setDetails()
	 * @param title The title of the film
	 * @param director The name of the director of the film
	 * @param duration The duration of the film in minutes
	 * @param cost The purchase cost of the film in pence.
	 */
	Film(String title, String director, int duration, int cost)
	{
		setDetails(title, director, duration, cost);
	}
	
	/**
	 * Returns the title of this film
	 * @return The title
	 */
	
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Sets the title of this film
	 * @param title The new title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Returns the name of the director of this film
	 * @return The name of the director
	 */
	public String getDirector()
	{
		return director;
	}
	
	/**
	 * Sets the name of the director of this film
	 * @param director The name of the director
	 */
	public void setDirector(String director)
	{
		this.director = director;
	}
	
	/**
	 * Returns the duration of this film, expressed in minutes
	 * @return The duration
	 */
	public int getDuration()
	{
		return duration;
	}
	
	/**
	 * Sets the duration, expressed in minutes, of this film
	 * @param duration The duration, which is assumed to be in minutes
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	/**
	 * Returns the purchase cost of this film, expressed in pence
	 * @return The cost in pence
	 */
	public double getCost()
	{
		return cost;
	}
	
	/**
	 * Sets the purchase cost of this film
	 * @param cost The cost
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	/**
	 * Sets all details of this film, in order
	 * @param title The title of the film
	 * @param director The name of the director of the film
	 * @param duration The duration of the film in minutes
	 * @param cost The purchase cost of the film in pence.
	 */
	public void setDetails(String title, String director, int duration, int cost)
	{
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.cost = cost;
	}
	
	/**
	 * Displays all details of this film.
	 */
	public void displayDetails()
	{
		System.out.println("Title: " + title);
		System.out.println("Director name: " + director);
		System.out.println("Duration: " + duration + "minutes");
		System.out.println("Cost: " + cost);
	}
}