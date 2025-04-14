package org.example;
import java.util.*;

public class Main {
static Scanner scanner = new Scanner(System.in);
static RentalCar rentalcar = new RentalCar();
public static void main(String[] args) {

startCarShop();




    }

public static void startCarShop(){
    boolean shopOpen = true;
    while (shopOpen){
        System.out.println("==================================================\nIs the shop open or is it time to close\n--open\n--close");
        String shopStatus = scanner.nextLine();
        if (shopStatus.equalsIgnoreCase("open")){
            shopOpen = true;
            rentalcar.rentCar();
        } else if (shopStatus.equalsIgnoreCase("close")) {
            System.out.println("\n--Shop Closed--");
            shopOpen = false;
        }
        else {
            System.out.println("--Invalid Entry--");
        }
    }
}

}