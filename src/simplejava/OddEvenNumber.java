package simplejava;

import java.util.List;

public class OddEvenNumber {

	public static void main(String[] args) {
		int num[]= {65,78,90,11};
		for(int a:num) 
		{
			if(a%2!=0)
			{
				System.out.println("odd"+a);
				
			}
			else
			{
				System.out.println("even"+a);
			}
		}

	}

}
