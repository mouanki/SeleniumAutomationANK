package TypesOfVariableAndSaticAndFinal;

public class StaticVar {

	String name;//these are instance variables//these variable value change form object to object
	String address;
	static String city;
	static int i;
	
	
	//making city static
	//if any variable is made static that variable copy is shared by all the objects 
	//static variable is tied to a class not with the object
	//memory allocation will be done only once for static variable
	//Static variable belongs to class it does not depends on the object 
	//value of the static variables remail same for all objects
	
	
	
	
	
	
	
	public StaticVar(String name,String address)//these are local variables
	{
		//here we assigning value to the class/instance variables from the object
		this.name=name;
		this.address=address; 
	}
	
	public void getData()
	{
		System.out.println(address);
		System.out.println(city);
	}
	
	static
	{
		
		city="kolkata";
		i=0;
	}
	
	//static methods
	//static methods only access static variables
	
	
	
	public static void getCity()
	{
		System.out.println(city);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv1=new StaticVar("bob","mbd");
		StaticVar sv2=new StaticVar("Mou","LOB");
		
		sv1.getData();
		sv2.getData();
		
		//calling static method by class name
		StaticVar.getCity();
		System.out.println(StaticVar.city);//calling static variable
		
	}

}
