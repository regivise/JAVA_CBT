package co.ke.aircomsystems;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int input1;
        int input2;
        int sum;
        System.out.println("Enter first number:");
        input1=input.nextInt();
        System.out.println("Enter second number");
        input2=input.nextInt();
        sum=input1 + input2;
        System.out.println("The sum of the 2 numbers is "+sum);
        System.out.printf("Sum is %d%n", sum);
    }
}
