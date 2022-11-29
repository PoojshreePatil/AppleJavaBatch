import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {

		int l,b,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length Of Rectangle:");
		l = sc.nextInt();
		System.out.println("Enter the breadth Of Rectangle:");
		b = sc.nextInt();
		
		perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle is:" +perimeter);
		sc.close();
	}

}
