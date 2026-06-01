/*
LAB ASSIGNMENT 1: Library Management System
Concepts Covered
Constructor, Methods, Method Overloading, Arrays, HAS-A Relationship

Problem Statement

Write a Java program to simulate a small library system that stores and displays book details.
Classes & Attributes
Class: Book
Attribute	Type	Description
title	String	Title of the book
author	String	Author of the book
price	double	Price of the book

Constructor:
Book(String title, String author, double price)  Initializes the book details.

Methods:
void displayBookInfo()  Displays all details of the book.

Class: Library
Attribute	Type	Description
books	Book[]	Array of book objects
count	int	Keeps track of number of books added

Methods:
void addBook(Book b)  Adds a new book to the library.
void showAllBooks()  Displays all the books.
void searchBook(String title)  Searches book by title.
void searchBook(String title, String author)  (Method Overloading) Searches book by both title and author.

HAS-A Relation:
Library has multiple Book objects.

Task:
Create a main() method to:
Create a Library object.
Add at least 3 books.
Display all books.
Search a book by title and author.
*/
 
class Book
{
	String title;
	String author;
	double price;
	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	void displayBookInfo(){
		
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
	
}

class Library
{
	Book book[] = new Book[3];
	int count=0;
	
	void addBook(Book b){
		
		book[count++]=b;
	 
	}
	
	void showAllBooks(){
		
		for(int i = 0; i<=count; i++){
			System.out.println(book[i]);
		}
		
		System.out.println("Total Book Present in the Library : " + count );
				
	}
	
	void searchBook(String title){
		boolean bb=false;
		for(Book b:book)
		{
			if(b.title.equals(title))
			{
					System.out.println( title + " this Book is Present in the Library ");
					bb=true;
			}
		}
		if(bb==false)
		{
			System.out.println( title + " this Book Not is Present in the Library ");
		}
		
	}
	
	void searchBook(String title, String author)
	{
		boolean bb=false;
		for(Book b:book)
		{
			if(b.title.equals(title) && b.author.equals(author))
			{
					System.out.println( title + " Book " + author + " is Present in the Library ");
					bb=true;
			}
		}
		if(bb==false)
		{
			System.out.println( title + " this Book Not is Present in the Library ");
		}
		
	}
	
}

public class MainLibrary{
	public static void main(String args[])
	{
		
	Library l=new Library();
	
	l.addBook(new Book("java","james",5000.0));
	l.addBook(new Book("computer","charles",5000.0));
	l.addBook(new Book("WOFire","APJ",5000.0));
	
	l.searchBook("java");
	l.searchBook("computer", "charles");
 
	}
}