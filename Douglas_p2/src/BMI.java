import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double pounds;
		double kilograms;
		double weight;
		double height;
		int formula;
		double totalBMI = 0;
		String category;
		System.out.println("Welcome to the BMI calculator!");
		System.out.println("For Pounds and Inches, enter 1. For Kilograms and Meters, enter 2.");
		formula = scnr.nextInt();
		if(formula == 1) {
			System.out.println("Weight in Pounds: ");
			weight = scnr.nextDouble();
			System.out.println("Height in inches: ");
			height = scnr.nextDouble();
			totalBMI = (703 * weight)/(height * height);
		}
		
		else if(formula == 2) {
			System.out.println("Weight in Kilograms: ");
			weight = scnr.nextDouble();
			System.out.println("Height in Meters: ");
			height = scnr.nextDouble();
			totalBMI = (weight)/(height * height);
		}
		System.out.printf("\nYour BMI is: %.2f\n", totalBMI);
		if(totalBMI > 30) {
			category = "Obesity";
		}
		else if(totalBMI < 18.5) {
			category = "Underweight";
		}
		else if(totalBMI > 18.49 && totalBMI < 24.5) {
			category = "Normal weight";
		}
		else {
			category = "overweight";
		}
		System.out.println("Your Category is: " + category);
		System.out.println("\nAccording to the National Heart Lung and Blood Institute\nBMI Categories: \nUnderweight = <18.5\nNormal weight = 18.5-24.9\nOverweight = 25-29.9\nObesity = BMI of 30 or greater");
		
	}

}
