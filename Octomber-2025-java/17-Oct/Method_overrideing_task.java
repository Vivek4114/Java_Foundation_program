Q1. Zoo Management System
=============================

You are tasked with creating a Zoo Management System that can handle different types of animals.
You need to implement classes that represent animals and their specific characteristics.
In this system, you'll implement the concept of inheritance and method overriding to showcase
the behavior of animals.

Follow the provided code as a base, and create the necessary classes to satisfy the
requirements below:

Create a class named Animal:
-----------------------------
It should have private instance variables name (String) and age (int).
Implement a constructor that initializes the name and age.
Define a method makeSound() that prints ""The animal makes a generic sound.""
Define a method displayInfo() that prints the name and age.

Create a subclass named Lion:
-----------------------------
Extend the Animal class.
Add a private instance variable maneLength (int).
Implement a constructor that takes name, age, and maneLength as parameters and initializes
the superclass constructor.
Override method makeSound() method to print ""The lion roars loudly.""
Define a method displayManeLength() that prints the maneLength.

Create another subclass named Elephant:
---------------------------------------
Extend the Animal class.
Add a private instance variable tuskLength (float).
Implement a constructor that takes name, age, and tuskLength as parameters and initializes
the superclass constructor.
Override the makeSound() method to print ""The elephant trumpets.""
Define a method displayTuskLength() that prints the tuskLength.

Create a class named ZooManagement (as provided in the code):
-------------------------------------------------------------
In the main method, create instances of both Lion and Elephant with appropriate values.
Print information about the lion and the elephant, including their specific attributes and
the sounds they make.

Your task is to implement the required classes based on the provided problem description.


Condition :
-----------
if any numeric value is zero or negative then print ""Error Invalid Input"".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any
numeric value is <=0 then print ""Error Invalid Input"".
               
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Lion:
               Name: ""Simba""
               Age: 5
               Mane Length: 20 cm

               Elephant:
               Name: ""Jumbo""
               Age: 10
               Tusk Length: 2.5 meters

sample output :
               Lion Details:
               Name: Simba, Age: 5
               The lion roars loudly.
               Mane Length: 20 cm
               
               Elephant Details:
               Name: Jumbo, Age: 10
               The elephant trumpets.
               Tusk Length: 2.5 meters


Q2. Online Shopping System
==============================

You are building an Online Shopping System, and you need to create a class hierarchy to
represent different types of products that customers can purchase. You will be implementing
a set of classes that model the products and their attributes. The focus of this problem is
to demonstrate the use of inheritance and method overriding in Java.

Follow the provided code as a base, and create the necessary classes to satisfy the
requirements below:

Create a class named Product:
-----------------------------
It should have protected instance variables name (String) and price (double).
Implement a constructor that initializes the name and price.
Define a method displayInfo() that prints the product's name and price.
Define a method calculateTotalCost(int quantity) that calculates and returns the total
cost of purchasing a given quantity of the product.

Create a subclass named Electronics:
------------------------------------
Extend the Product class.
Add a private instance variable brand (String).
Implement a constructor that takes name, price, and brand as parameters and initializes
the superclass constructor.
Define a method displayInfo() method to additionally print the product's brand.

Create another subclass named Clothing:
---------------------------------------
Extend the Product class.
Add a private instance variable size (String).
Implement a constructor that takes name, price, and size as parameters and initializes
the superclass constructor.
Override displayInfo() method to additionally print the product's size.

Create a class named OnlineShopping (as provided in the code):
--------------------------------------------------------------
In the main method, create instances of both Electronics and Clothing with appropriate values.
Print information about each product, including their specific attributes.
Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description.
This will help you practice inheritance concepts.

Note-Implement toString() in all the BLC classes to print the data of the corresponding objects.

Condition :
-----------
if any numeric value is zero or negative then print ""Error Invalid Input"".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if
any numeric value is <=0 then print ""Error Invalid Input"".
               
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Electronics Product:
               Name: ""Laptop""
               Price: $1200.00
               Brand: ""Dell""
               Quantity: 2
               
               Clothing Product:
               Name: ""T-Shirt""
               Price: $25.00
               Size: ""Medium""
               Quantity: 3

sample output :
               Electronics Details:
               Product Name: Laptop
               Price: $1200.0
               Brand: Dell
               Total Cost for 2 units: $2400.0
               Electronics [name=Laptop, price=1200.0, brand=Dell]
               
               Clothing Details:
               Product Name: T-Shirt
               Price: $25.0
               Size: Medium
               Total Cost for 3 units: $75.0
               Clothing [name=T-Shirt, price=25.0, size=Medium]

" Circle and Cylinder Shape Calculation Program
======================================================

You are tasked with developing a software application for a company that designs
custom containers.
The company needs to calculate the surface area of circular bases and the volumes
of cylindrical containers to estimate materials and costs.
To achieve this, you will create a Java program with the following requirements:


Class Circle is given to you.
----------------------------

Add below details to the class

1. Instance variables:
radius: double.

2. Create a no constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius.

4. Create below methods,

Method name: getArea
Return type: double
This method should return the area of the circle. Return -1 if radius is negative.

Create a sub class of Circle with name Cylinder
-----------------------------------------------

Add below details to the class
1. Instance variables:
height: double.

2. Create a No constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius, height.

4. Create below methods,
Method name: getVolume
Return type: double
This method should return the volume of the cylinder. Return -1 if height is negative.

An ELC class ShapeTester is given to you with a main method. Use this class to test your



Condition :
-----------
if any numeric value is zero or negative then print ""Error Invalid Input"".


TEST CASE 1 :
-------------
sample input  : When your reading values for Circle Class OR Cylinder class then make sure
if any numeric value is <=0 then print ""Error Invalid Input"".
               
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input  : Cylinder c = new Cylinder(5, 5);
sample output : Volume = 392.5
                Area = 78.5