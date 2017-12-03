// Inlab 3: A Cart GroceryItems
// 
// Due: Tuesday 16 September at 11:59 pm
// Purpose
// 
// Create a program that involves interacting classes.
// Create methods that operate across classes and do more complicated operations.
// Partners
// 
// This is an individual assignment, though collaboration (not solution sharing) is allowed.
// 
// Problem Statement
// 
// This project has two phases. The first phase is to create a Cart class that will represent a shopping cart. You will be able to add GroceryItem objects to instances of your Cart class and calculate the cost (plus 7% tax) of the items in the cart. To simplify and standardize things, I will provide a GroceryItem class that is very similar to the one you developed in Outlab1.
// 
// The second phase will involve keeping inventory of GroceryItems up to date based on how many were purchased. You may make the following assumptions about the system to make things easier:
// 
// GroceryItems will not be removed from the Cart. Once some number of a GroceryItem is placed in a Cart, it will be purchased.
// You do not need to format your numerical output to have the correct number of decimal places for currency (see output below).
// Each cart will have exactly two types of items in it before the receipt is printed.
// Users will not try to add more units of a GroceryItem into a Cart than there are in stock. (Only applicable for phase 2)
// Assignment
// 
// Phase 1 (Grocery Cart):
// 
// Create a project called Inlab3.
// Copy this code into a class called GroceryItem. Review this code and make sure you understand what is happening.
// Copy this code into a class called Driver. Read this code closely as it tells you about Cart's constructor, the addItem() methods, and the printReceipt() method.
// Correctly implement the methods you need to get the Driver to compile and run.
// If implemented correctly, your output will look like this.
// Phase 2 (Inventory Tracking):
// 
// Modify the GroceryItem class so that you are now keeping track of the number of that item in stock. Hint: This will involve making a new instance variable, modifying the constructor to take a parameter for that variable, and making a method to update the value of that variable.
// Also add a method to the GroceryItem class that will print out (not return) the name and number in stock of the item (see output below).
// Modify your Cart class so that it updates the number in stock for an item when it is placed in the Cart.
// Modify the Driver so that it calls the modified GroceryItem constructor correctly and print out the inventory for the three items currently created.
// If implemented correctly, your output will now look like this, provided that the initial number in stock of milk is 75, eggs is 83, and ice cream is 37.
// Submission
// 
// By Tuesday night at 11:59 pm, submit the files Cart.java, GroceryItem.java, and Driver.java into the appropriate D2L dropbox folder. DO NOT SUBMIT .class files.
// 
// Grading - 10 points
// 
// Phase 1
// 
// 3 points - The Cart class compiles with the other provided classes.
// 2 points (1 point for Honors Lab) - The total cost for each shopper is accurate.
// 2 points (1 point for Honors Lab) - The output is formatted in the same fashion as shown above.
// Phase 2