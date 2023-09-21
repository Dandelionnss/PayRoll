package javastart1;
import java.util.Scanner;
public class JvaPyRoll {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		// Dandelionnss Taehyung //
		
		// PAYROLL CALCULATOR //
		
		// User's Data input
		System.out.print("Enter Your Name: ");
		String name = user.nextLine();
		
		System.out.print("Enter Your Position: ");
		String Position = user.nextLine();
		
		System.out.print("Enter Your Hourly-rate: ");
		double Hrate = user.nextDouble();
		
		System.out.print("Enter Your Worked-Hour: ");
		double Whour = user.nextDouble();
		
		// Calculating Stage
		double RegularPay;
		double Overtime;
		double TotalPay;
		double Insurance = 2500; //20% of insurance
		
		if (Whour > 8) {
			RegularPay = Whour * Hrate;
			Overtime = RegularPay * 2;
			TotalPay = Overtime - Insurance;
			
			// Receipt Of Payroll // 
			System.out.println("\n Payroll Receipt ");
			System.out.println("Name                 : " + name);
			System.out.println("Position             : " + Position);
			System.out.println("Regular Payment      : " + RegularPay);
			System.out.println("Overtime Payment 2x  : " + Overtime);
			System.out.println("Insurance            : " + Insurance);
			System.out.println("YOUR TOTAL SALARY is : " + TotalPay);
		}else {
			RegularPay = Whour * Hrate;
			TotalPay = RegularPay - Insurance;
			
			// Receipt Of Payroll // 
			System.out.println("\n Payroll Receipt ");
			System.out.println("Position          : " + Position);
			System.out.println("Regular Payment   : " + RegularPay);
			System.out.println("Overtime Payment  : 0.00" );
			System.out.println("Insurance         : " + Insurance);
			System.out.println("YOUR TOTAL SALARY : " + TotalPay);
		}

		

	}

}
