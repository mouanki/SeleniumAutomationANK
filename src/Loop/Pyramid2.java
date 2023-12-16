package Loop;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 1
	 * 2 3
	 * 4 5 6
	 * 7 8 9 10	
	 */
		int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)//4-i
			{
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	
	/* 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 *  
	 * 
	 */
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<=i;j++)//4-i
		{
			
			System.out.print(j);
			System.out.print("\t");
			
		}
		System.out.println("");
	}

	/*
	 * 3
	 * 6 9
	 * 12 15 18
	 */
	int k1=1;
	for(int i=1;i<4;i++)
	{
		for(int j=1;j<=i;j++)//4-i
		{
			
			System.out.print(k1*3);
			System.out.print("\t");
			k1++;
			
		}
		System.out.println("");
	}
}
}
