package Loop;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k=1;
		for (int i=0;i<4;i++)
		{
			//System.out.println("Outer loop");//i=1,j=1
			for (int j=1;j<=4-i;j++)
			{
				System.out.print(k);//without new line use print instead of println
				System.out.print("\t");
				k++;
			}
			System.out.println("");//use println for new line
			
		}
	}

}


/*
1234
567
89
10
*/