package SuperKeyWord;

public class ChildDemo extends ParentDemo {

	String name = "QAclick";
	
	public ChildDemo()
	{
		super();//to use the parent constructor 
		// whenever we want to use the parent class constructor super() should be in the first line in child constructor
		System.out.println("Child class constructor");
	}

	public void getStringValue() {
		System.out.println(name);
		System.out.println(super.name);//getting the variable form parent
	}

	public void getData() {
		System.out.println("I am in Child Class");
		super.getData();//getting the method from parent 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringValue();
		cd.getData();
		

	}

}
