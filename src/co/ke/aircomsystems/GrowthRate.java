package co.ke.aircomsystems;
import java.util.Scanner;
public class GrowthRate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of year(s)from today: ");
        double years=input.nextDouble();

        System.out.println("Enter current world population(Billions) in 2 decimal places");
        double WorldPopulation= input.nextDouble();
        double rate = 0.0876;
        double ratePerYear= rate * years;
        double CalculatedPopulation = ratePerYear + WorldPopulation;

        System.out.println("The world population in "+ years + " year(s) will be " + CalculatedPopulation+" Billion.");

        input.close();
    }
}
