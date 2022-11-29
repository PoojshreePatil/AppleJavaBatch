
public class SumofFactors {

	void calculate(int a)
	{
		int sum=0;
		for(int i=1; i<= a;i++)
		{
			if(a % i == 0)
			{
				sum = sum + i;
				System.out.println(i);
			}
		}System.out.println("Sum of factor is: "+sum);
		 
	}
	
	public static void main(String[] args) {

		SumofFactors s = new SumofFactors();
		
		s.calculate(12);
	}

}
