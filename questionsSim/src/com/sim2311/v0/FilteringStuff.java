package com.sim2311.v0;

import java.util.*;
import java.util.function.Predicate;

//What can be inserted into the following code at 
//1 so that it will print "Oldboy"?

//imports not shown

class Movie {
	
	static enum Genre {
		DRAMA, THRILLER, HORROR, ACTION
	};
	
	private Genre genre;
	private String name;

	Movie(String name, Genre genre) {
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

public class FilteringStuff {
	public static void main(String[] args) {
		
      List<Movie> movies = Arrays.asList(
              new Movie("On the Waterfront", Movie.Genre.DRAMA),
              new Movie("Psycho", Movie.Genre.THRILLER),
              new Movie("Oldboy", Movie.Genre.THRILLER),
              new Movie("Shining", Movie.Genre.HORROR)
              );
      
      Predicate<Movie> horror = 
    		  mov->mov.getGenre() == Movie.Genre.THRILLER;
    		  
      Predicate<Movie> name = 
    		  mov->mov.getName().startsWith("O");
      
      movies.stream()
            .filter(name)
            .filter(horror)
            .forEach(mov->System.out.println(mov.getName()));
  }

}