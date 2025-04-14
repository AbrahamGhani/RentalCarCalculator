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
    System.out.println("\n=========================\n3. Do you want an Electronic Toll Tag?($3.95/day)\n--PLEASE WRITE THIS AS 'true' OR 'false'");
    this.tollTag = scanner.nextBoolean();
    System.out.println("\n=========================\n4. Do you want a GPS?($2.95/day)\n--PLEASE WRITE THIS AS 'true' OR 'false'");
    this.GPS = scanner.nextBoolean();
    System.out.println("\n=========================\n3. Do you want Roadside Assistance?($3.95/day)\n--PLEASE WRITE THIS AS 'true' OR 'false'");
    this.roadsideAssistance = scanner.nextBoolean();

    if (tollTag && roadsideAssistance && GPS){
        rentalPrice += 3.95 + 2.95 + 3.95;
        System.out.println("\nWith all the options your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
    }
    else if (roadsideAssistance && GPS) {
        rentalPrice += 3.95 + 2.95;
        System.out.println("\nWith the GPS and Roadside Assistance your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
    }
    else if (roadsideAssistance && tollTag) {
        rentalPrice += 3.95 + 3.95;
        System.out.println("\nWith the Road Assistance and a Toll Tag your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
    }
    else if (GPS && tollTag) {
        rentalPrice += 3.95 + 2.95;
        System.out.println("\nWith the GPS and Toll Tag your price is currently at $" + String.format("%.2f", rentalPrice) + "\n");
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
}



}
