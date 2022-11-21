package seleniumhybridproject;

public class PrimeUsingFor {

	public static void main(String[] args) {
		int n=3;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("number is not prime");
				return;
			}
			
		}
		System.out.println("number is prime");
	}

}
