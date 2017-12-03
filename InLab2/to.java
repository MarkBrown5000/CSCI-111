// Inlab 2: Book Class and Driver
// 
// Due: Tuesday 09 September at 11:59 pm
// Purpose
// 
// Get further practice building a simple class.
// Make a Driver that can create instances of a class.
// Get comfortable manipulating instances of a class.
// Partners
// 
// This is an individual assignment, though collaboration (not solution sharing) is allowed.
// 
// Problem Statement
// 
// The Montana State University book store needs your help to build a system that keeps track of inventory. You will build a Book class to represent books and a Driver with which you will manipulate instances of the Book class. A book object consists of a title (such as "Extreme Alpinism"), a number of books in stock (such as 132), and a cost per book (such as 12.95).
// 
// Assignment
// 
// Book Class
// 
// After signing into one of the lab computers, open up the BlueJ environment and create a new project called Inlab2.
// Within the Inlab2 project, create a new class called Book.
// Create instance variables in the book class to fit the specifications detailed in the Problem Statement. (You can name the variables however you see fit)
// Make a constructor that takes a book's title, number in stock, and cost as parameters and sets the correct variables.
// Make a "get method" for each instance variable.
// Make a method that will calculate and return the total value of that book the store has in stock (ex: 22 copies of "Dracula" at $7.55 per book means the total value of $166.10).
// Driver Class
// 
// In the Inlab2 project, create a class called Driver with a main method like we did in class. Main method header: public static void main(String[] args)
// Within the main method, create a variable called book1 that can hold an instance of the Book class.
// Create an instance of the Book class where the book's name is "Dracula", cost is 7.55, and number in stock is 22 and store this instance in book1.
// Print out the name and value of stock of book1 using the correct methods from the Book class.
// Create a second instance of Book with parameters of your choosing and store in a variable called book2. Print out the name and value of book2.
// Run the main method in Driver (right click Driver, select void main(String[] args), select "ok") and check that the output for book1 and book2 are both correct.
// Honors Component
// 
// If you are in the Honors Lab (Section 5), you have the following additional requirements:
// Make an additional method in the Book class called bookSold(). This method will reduce the number in stock by 1 (it simulates having sold one book).
// Call this new method from the Driver several times on one of the Book instances and print the number in stock before and after, to make sure your method works.
// Submission
// 
// By Tuesday night at 11:59 pm, submit the files Book.java and Driver.java into the appropriate D2L dropbox folder. DO NOT SUBMIT Book.class or Driver.class.
// 
// Grading - 10 points
// 
// 1 point - The instance variables in the Book class are correct and appropriately named.
// 1 point - The constructor for the Book class is correct.
// 1 point - There is a "get method" for each instance variable.
// 3 points (2 points for Honors lab) - The total value method works correctly and is reasonably efficient (doesn't require new instance variables).
// 3 points (2 points for Honors lab) - Two instances of Book are correctly initialized.
// 1 points - Program output looks good (reasonable formatting, correct spelling...).
// 0 points (2 points for Honors lab) - The bookSold() method works correctly and is used in the Driver.
