package ArraysDemo;

public class FindMaxNumFromTheRowWhereYouGetTheMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1: find the min number
		//step 2: identify and keep the column of the min number
		//step 3: iterate all the rows and the itentified column to find the max number 
		
		
		
		
		
		

		int[][] a= {{2,4,5},{3,2,10},{1,2,0}};
		
		
		int min=a[0][0];	
		int mincol=0;
		int max=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincol=j;
					
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			if(a[i][mincol]>max)
			{
				max=a[i][mincol];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
