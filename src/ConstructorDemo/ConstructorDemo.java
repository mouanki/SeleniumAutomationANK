package ConstructorDemo;

public class ConstructorDemo {

	public ConstructorDemo()//explicit or default
	{
		System.out.println("I am in the constructor");
	}
	public ConstructorDemo(int a,int b)//parameterized constructor
	{
		System.out.println("I am in the parametrized constructor");
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo(4,6);
		
		

	}

	

}
