package ArraysDemo;

public class PrintMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//print minimum number from the array	
		
		
		
		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		
		int min=a[0][0]; //assume the first value in the array is smallest
		//traverse and compare 
		//if small than min then assign it to min
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			
		}
		System.out.println(min);
	
	
	//find max number form array
	int max=a[0][0]; //assume the first value in the array is the max
	//traverse and compare 
	//if greater than max then assign it to min
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if (a[i][j]>max)
			{
				max=a[i][j];
			}
		}
		
	}
	System.out.println(max);
}
}
