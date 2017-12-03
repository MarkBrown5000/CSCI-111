
/**
 * Write a description of class Assignment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assignment
{
// Outlab 2: Navy Fuel Consumption
// 
// Due: Monday 22 September at 8 am
// Purpose
// 
// Create a system consisting of multiple interacting classes.
// 
// Partners
// 
// This is an individual assignment, though collaboration (not solution sharing) is allowed.
// 
// Problem Statement
// 
// You have been commissioned by the US Navy to develop a system for tracking the amount of fuel consumed by fleets of ships. Each ship has a name (ex: "Carrier"), fuel capacity (the maximum amount of fuel the ship can carry), and amount of fuel currently onboard. In this problem, fuel is measured in "units" and the capacity of each ship is an integer number (ex: The carrier's capacity is 125 fuel units). Each fleet has exactly four ships in it. When a fleet is deployed, each ship in the fleet is deployed. When a ship is deployed, it consumes half of the fuel it has onboard. When a fleet is refueled, each ship in the fleet is refueled. When a ship is refueled, it is totally filled up (its onboard amount equals its capacity).
// 
// Assignment
// 
// Create a BlueJ project called Outlab2, add a class called Driver and paste this code into it. Driver should not be modified.
// Carefully review the Driver as it contains clues about the structure of the rest of the program.
// Your Fleet class needs 4 methods:
// A constructor that takes 4 Ships as parameters.
// A method called deploy that will deploy each ship in the fleet.
// A method called refuel that will refuel each ship in the fleet.
// A method called printSummary that will print, for each ship, the ship's name and the total number of fuel units that ship has consumed throughout its existence.
// From reviewing the Driver, you can see that you will need a Ship class as well. The constructor of this class will take the ship's name and fuel capacity as parameters.
// Infer from the Problem Statement what instance variable and methods you need in the Ship class.
// Hints
// 
// Think about what variables you need in Ship. I did not tell you what all the variables you may need are.
// Create Ship first without worrying about tracking fuel consumed. Get the program working just with worrying about deploying and refueling.
// You can test Ship without Fleet or Driver by creating instances of Ship and calling the methods you wrote on it.
// Test and print out intermediate phases of your design (ex: when I deploy a fleet, does the amount of fuel onboard each ship successfully decrease by half?)
// Finally, test your product. I predict that numerous people will turn in incorrect solutions without even checking to see the output is correct. (What SHOULD the amount of fuel consumed be?)
}
