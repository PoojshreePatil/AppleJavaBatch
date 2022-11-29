import java.util.Scanner;

public class FibonacciXobinTest {

	public static void main(String[] args) {
		
		 int a=0,b=1;
	    	Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	    
	        // ***************** END: UNTIL THIS LINE
	     
	       // START: WRITE YOUR LOGIC BELOW THIS STATEMENT
	       for(int i =1;i <=num ;i++)
	       {
	         int  c = a + b;
	         System.out.println(a);
	         a = b;
	         b = c;
	       }
	    
	      	// END: WRITE YOUR LOGIC ABOVE THIS STATEMENT
	      
	    }

	}


