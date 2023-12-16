package simplejava;

public class ReverseANumber {

	public static void main(String[] args) {
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
