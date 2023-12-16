package ArraysDemo;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//used if we want to store data in table format
		
		int a[][]= {{2,4,5,9},{3,4,7,8}};
		
		//System.out.println(a[0][0]);
		System.out.println(a.length);
		
		//print all values
		//length is 2
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		
		
		
	}

}
