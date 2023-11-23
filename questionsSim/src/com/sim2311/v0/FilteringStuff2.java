package com.sim2311.v0;

import java.util.*;
import java.util.function.Predicate;

//What can be inserted into the following code at 
//1 so that it will print "Oldboy"?

//imports not shown

enum Genre {
	DRAMA, THRILLER, HORROR, ACTION
};

class Movie2 {
	
	private Genre genre;
	private String name;

	Movie2(String name, Genre genre) {
		this.name = name;
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class FilteringStuff2 {
	public static void main(String[] args) {
		
	  System.out.println("Movie2");
		
      List<Movie2> movies = Arrays.asList(
              new Movie2("On the Waterfront", Genre.DRAMA),
              new Movie2("Psycho", Genre.THRILLER),
              new Movie2("Oldboy", Genre.THRILLER),
              new Movie2("Shining", Genre.HORROR)
              );
      
      Predicate<Movie2> horror = 
    		  mov->mov.getGenre() == Genre.THRILLER;
    		  
      Predicate<Movie2> name = 
    		  mov->mov.getName().startsWith("O");
      
      movies.stream()
            .filter(name)
            .filter(horror)
            .forEach(mov->System.out.println(mov.getName()));
  }

}