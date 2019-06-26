package co.ke.aircomsystems;
import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in lbs: ");
        int weightLBS=input.nextInt();

        System.out.println("Enter height in inches");
        int heightInches=input.nextInt();


        int BMI = (weightLBS * 703) / (heightInches * heightInches);
        System.out.println("Your BMI is: "+ BMI);

        if (BMI <= 30)
            System.out.println("Your weight is normal");
        else
            System.out.println("You need to exercise!!");
        input.close();

    }
}
