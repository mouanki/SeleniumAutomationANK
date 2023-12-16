package Inheritance;

public class ChildClassDemo extends ParentClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd= new ChildClassDemo();
		//cd.colour();
		cd.brakes();//it will refer to the brakes of the child
		System.out.println(cd.c);
		cd.gear();
	}
	public void engine()
	{
		System.out.println("new child engine");
	}
	public void colour()
	{
		System.out.println(c);//making use of parent class colour
	}
	public void brakes()//method overidding
	{
		System.out.println("brakes in child");

	}

}
