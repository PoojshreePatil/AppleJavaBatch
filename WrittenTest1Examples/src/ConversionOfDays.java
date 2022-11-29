import java.util.Scanner;

public class ConversionOfDays {

	public static void main(String[] args) {

		int days,weeks,years;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days:");
		days = sc.nextInt();
		
		years= (days/365);
		weeks =(days % 365 )/ 7;
		days =(days % 365) % 7;
		 System.out.println("Years :" +years);
		 System.out.println("Weeks: "+weeks);
		 System.out.println("Days:"+days);
		 sc.close();
	}

}
