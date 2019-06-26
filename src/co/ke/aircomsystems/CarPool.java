package co.ke.aircomsystems;
import java.util.Scanner;

public class CarPool {
    public static void main (String [] args) {

            Scanner input = new Scanner (System.in);

            int totalMiles;
            int gasolineCost;
            int milesPerGallon;
            int parkingFees;
            int tolls;
            int dailyDrivingCost;

            System.out.println ("This Application Calculates Your Daily Driving Cost");

            System.out.println (); //displays a blank line

            System.out.print ("Enter Total Miles Driven Per Day: ");
            totalMiles = input.nextInt();
            System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
            gasolineCost = input.nextInt();
            System.out.print ("Enter Average Miles Per Gallon: ");
            milesPerGallon = input.nextInt();
            System.out.print ("Enter Parking Fees Per Day: ");
            parkingFees = input.nextInt();
            System.out.print ("Enter Tolls Per Day: ");
            tolls = input.nextInt();

            dailyDrivingCost = (totalMiles / milesPerGallon) * gasolineCost + parkingFees + tolls;

            System.out.println("\n");
            System.out.printf ("Your Daily Driving Cost Is: %d\n", dailyDrivingCost);

        }
    }
