package simplejava;

public class ReverseANumber {

	
	public static void main(String[] args) {
		System.out.println("This is reverse number demo");
		System.out.println("This is reverse number develop");
		System.out.println("This is reverse number develop branch");
		int number= 354;
		int rev=0;
		int rem;
		while(number>0)
		{
			rem=number%10;
			rev=(rev*10)+rem;
			number=number/10;
			
		}
System.out.println("number ="+ rev);
	}

}
