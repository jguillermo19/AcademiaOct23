package com.sim2311.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Book0 {
	private int id;
	private String title;
	private String genre;
	private String author;
	private double price;

	public Book0(int id, String title, String genre, String author, double price) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", author=" + author + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {

		// Arrays de categorías y autores
		String[] categories = { "Ficción", "Ciencia ficción", "Misterio", "Aventura" };
		String[] authors = { "Autor1", "Autor2", "Autor3" };

		// Crear un generador de números aleatorios
		Random random = new Random();

		// Crear un array de libros para almacenar los 30 objetos
		Book0[] books = new Book0[50];

		// Generar 30 objetos Book con categorías y autores aleatorios
		for (int i = 0; i < 50; i++) {
			int id = i + 1;
			String title = "Libro " + id;
			String genre = categories[random.nextInt(categories.length)]; // Seleccionar una categoría aleatoria
			String author = authors[random.nextInt(authors.length)]; // Seleccionar un autor aleatorio
			double price = 10.0 + random.nextDouble() * 20.0; // Precio aleatorio entre 10 y 30

			books[i] = new Book0(id, title, genre, author, price);
		}
		
		List<Book0> listaLibros = 
				new ArrayList<>(Arrays.asList(books));
		
		//listaLibros.forEach(System.out::println);

		System.out.println("****************");
		
		Book0 book1 = new Book0(1,"Novela1","Novela","Rolas",16.0);
		Book0 book2 = new Book0(2,"Novela2","Novela","Patrobas",26.0);
		Book0 book3 = new Book0(3,"Superacion1","Superacion","Rolas",36.0);
		Book0 book4 = new Book0(4,"Superacion2","Superacion","Patrobas",46.0);
		Book0 book5 = new Book0(5,"Superacion3","Superacion","Rolas",56.0);

		List<Book0> listaLibrosRolas = new ArrayList<>();
		listaLibrosRolas.add(book1);
		listaLibrosRolas.add(book3);
		listaLibrosRolas.add(book5);

		List<Book0> listaLibrosPatrobas = new ArrayList<>();
		listaLibrosPatrobas.add(book2);
		listaLibrosPatrobas.add(book4);		
		
		Map<String, List<Book0>> mapaAutores = new HashMap<>();
		mapaAutores.put("Rolas", listaLibrosRolas);
		mapaAutores.put("Patrobas", listaLibrosPatrobas);
		
		//mapaAutores.forEach((x,y)-> 
		//   System.out.println("Autor: "+x+" Libros: "+ y));
		
		List<Book0> listaLibrosRolasNovela = new ArrayList<>();
		listaLibrosRolasNovela.add(book1);
		
		List<Book0> listaLibrosPatrobasNovela = new ArrayList<>();
		listaLibrosPatrobasNovela.add(book2);
		
		Map<String, List<Book0>> mapaAutoresNovela = new HashMap<>();
		mapaAutoresNovela.put("Rolas", listaLibrosRolasNovela);
		mapaAutoresNovela.put("Patrobas", listaLibrosPatrobasNovela);
		
		List<Book0> listaLibrosRolasSuperacion = new ArrayList<>();
		listaLibrosRolasSuperacion.add(book3);
		listaLibrosRolasSuperacion.add(book5);

		List<Book0> listaLibrosPatrobasSuperacion = new ArrayList<>();
		listaLibrosPatrobasSuperacion.add(book4);
		
		Map<String, List<Book0>> mapaAutoresSuperacion = new HashMap<>();
		mapaAutoresSuperacion.put("Rolas", listaLibrosRolasSuperacion);
		mapaAutoresSuperacion.put("Patrobas", listaLibrosPatrobasSuperacion);
		
		Map<String, Map<String, List<Book0>>> mapaCategoria = new HashMap<>();
		
		mapaCategoria.put("Novela", mapaAutoresNovela);
		mapaCategoria.put("Superacion", mapaAutoresSuperacion);
		
		mapaCategoria.forEach((x,y)-> 
		   System.out.println("Categoria: "+x+" ListaLibrosAutor: "+ y));
		
		
		
		//Map<String, Map<String, List<Book>>> classified = null;
	}
}

//Map<String, Map<String, List<Book>>>  //1
//and 
//x->x.getGenre(), x->x.getAuthor()
//
// 
//Map<String, Map<String, Book>>  //2*
//and 
//x->x.getGenre(), x->x.getAuthor()
//
//Map<String, Map<String, List<Book>>> //3
//and 
//Book::getGenre, Collectors.groupingBy(Book::getAuthor)
//
//Map<String, Map<String, List<Book>>>  //4
//and 
//Book::getGenre().groupingBy(Book::getAuthor)
//
//Map<String, Map<String, List<Book>>> //5
//and 
//Book::getGenre, Collectors.mapping(Book::getAuthor, Collectors.toList())

//Assuming that books is a List of Book objects, 
//what can be inserted in the code below at 
//DECLARATION and EXPRESSION so that it will classify 
//the books by genre and then also by author?
//
//DECLARATION classified = null; 
//classified = books.stream().collect(Collectors.groupingBy(         
//     EXPRESSION )); 
//System.out.println(classified);