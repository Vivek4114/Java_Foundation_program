/*
 Q3). "Design a Book printing System

Create a class  Book (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

Name                     data type 
-------                      -----------
title                 :String
author                     :author
price                       :double

Implement a parameterized constructor to initialize all the fields

Methods :
Genearte displayDetails() method to print object properties.

Method Name                :applyDiscount(double discountPercentage)
Return type                :void
Acess modifier             :public


Take Main class (ELC Class) which having in main method  and execute the main method


Test Cases :
--------------

Test Case 1:
 Applying Invalid Discount (Negative)

Error: Invalid discount percentage.
Title: 1984
Author: George Orwell
Price: ₹14.391

Test Case 2: Creating Book with Negative Price
Title: Negative Price Book
Author: No Author
Price: ₹-5.0
*/

import java.util.Scanner;

public class BookStore{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book Title : ");
		String title = sc.nextLine();
		System.out.println("Enter the Book author : ");
		String author = sc.nextLine();
		System.out.println("Enter the Book Price : ");
		double price = sc.nextDouble();
		//System.out.println("Enter the discouted Percentage");
		//double discount = sc.nextDouble();
		 
		Book b1 = new Book(title, author, price);
		//b1.setPercentage();
	  	System.out.println(b1.displayDetails());
	
		
		//System.out.println("Discount Percentage Is : "+discount);
		// System.out.println("Price After Discount : " + b1.applyDiscount(discount));
	 }
}

class Book
{
	private String title;                 
	private String author;                    
	private double price ;  
	
	
	Book(String title, String author, double price){
		
		if(!(title.isEmpty()) || !author.isEmpty()){
		this.title = title;
		this.author = author;
		}
		else{
			System.out.println("Enter the Valid Title or author ");
			System.exit(2);
		}
		if(price > 0){ 
		this.price = price;
		}
		else{
			System.out.println("Enter the Valid Price ");
			System.exit(2);
		}
	}
	
	public String setPercentage(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Discount Percentage : ");
		double disPercentage = sc.nextDouble();
		double disAfterPrice = applyDiscount(disPercentage);
		return "Discount Rate is : "+ disPercentage+
			"\nPrice After Discount :"+ disAfterPrice;
	} 

	public double applyDiscount(double discountPercentage){
		if(discountPercentage > 0){
		double disAmount =  price - (price * (discountPercentage/100.0));
		return disAmount;
		}
		else{
			System.out.println("Enter the Valid discount Amount ");
			
			System.exit(2);
			return 0;
		}
	}
	
	public String displayDetails(){
	 
		return " Book Title : "+ title +
				"\n Book Author : "+ author +
				"\n Book Price : "+price +
			`	"\n "+setPercentage();
		
	 }
 }