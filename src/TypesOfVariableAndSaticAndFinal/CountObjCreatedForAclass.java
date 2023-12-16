package TypesOfVariableAndSaticAndFinal;

public class CountObjCreatedForAclass {

	
	static int count =0;
	
	public CountObjCreatedForAclass()
	{
		count++;
	}
	public void getcount()
	{
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountObjCreatedForAclass obj1=new CountObjCreatedForAclass();
		CountObjCreatedForAclass obj2=new CountObjCreatedForAclass();
		CountObjCreatedForAclass obj3=new CountObjCreatedForAclass();
		obj3.getcount();

	}

}
