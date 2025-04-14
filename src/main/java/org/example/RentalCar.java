package org.example;
import java.util.*;
public class RentalCar {
static Scanner scanner = new Scanner(System.in);
    String pickupDate;
    int numDaysRented;
    boolean tollTag;
    boolean GPS;
    boolean roadsideAssistance;
    int age;
    double rentalPrice = 29.99;
    int optionStatus;

public void getRentCarVals(){
    System.out.println("\nIn order to start your rental please enter the following details.\n" +
            "\n1. What is the date of the rental?");
    this.pickupDate = scanner.nextLine();
    System.out.println("\n=========================\n2. How many days do you wish to rent?");
    this.numDaysRented = scanner.nextInt();
    scanner.nextLine();
    System.out.println("\n=========================\n2. What is your age?");
    this.age = scanner.nextInt();
    scanner.nextLine();

}

public void options(){
    System.out.println("\n=========================\nWhat options would you like?\n 0 = All options\n 1 = GPS and Roadside\n 2 = Roadside and Toll Tag\n 3 = Toll Tag and GPS\n 4 = GPS\n 5 = Toll Tag\n 6 = Roadside\n 7 = No options");
    optionStatus = scanner.nextInt();
    scanner.nextLine();
    switch (optionStatus){
        case 0:
            rentalPrice += 3.95 + 2.95 + 3.95;
            System.out.println("\nWith all the options your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
            break;
        case 1:
            rentalPrice += 3.95 + 2.95;
            System.out.println("\nWith the GPS and Roadside Assistance your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
            break;
        case 2:
            rentalPrice += 3.95 + 3.95;
            System.out.println("\nWith the Road Assistance and a Toll Tag your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
            break;
        case 3:
            rentalPrice += 3.95 + 2.95;
            System.out.println("\nWith the GPS and Toll Tag your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
            break;
        case 4:
            rentalPrice += 2.95;
            System.out.println("\nWith the GPS your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
            break;
        case 5:
            rentalPrice += 2.95;
            System.out.println("\nWith the Toll Tag your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
        case 6:
            rentalPrice += 3.95;
            System.out.println("\nWith Roadside Assistance your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
        case 7:
            System.out.println("\nWith no options your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
    }


}

public void rentCar(){
    System.out.println("------------------------\nCar rental is " + String.format("%.2f", rentalPrice) + " with a 30% surcharge for individuals under the age of 25\n\n");
    getRentCarVals();
    options();
    if (age <25){
        rentalPrice *= 1.3;
        System.out.println("Since you are under the age of 25, there will be a 30% surcharge on your rental price.\n=========================\nThe total per day is now: $" + String.format("%.2f", rentalPrice));
        rentalPrice *= numDaysRented;
        System.out.println("The total is now: $" + String.format("%.2f", rentalPrice) + "\n");
    }
    else {
        rentalPrice *= numDaysRented;
        System.out.println("Your total is: $" + String.format("%.2f", rentalPrice) + "\n");
    }
    System.out.println("Please make sure to return the car in " + numDaysRented + " days or you will be charged an additional fee.\n");
}



}
