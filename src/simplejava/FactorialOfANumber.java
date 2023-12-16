package simplejava;

public class FactorialOfANumber {
	public static void main(String[]args)
	{
		int number=5;
		int fact=factorial(number);
		System.out.println(fact);
//		for (int i=1;i<=number;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
//	}
		
		
	}
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			System.out.println(n);	
		return (n * factorial(n-1));
	}
}
