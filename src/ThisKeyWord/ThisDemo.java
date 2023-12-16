package ThisKeyWord;

public class ThisDemo {

	//this keyword ties to the current object that is the current class opbect
	//object scope lies in class level
	//here class variable i.e global variable a=2
	//if we want to access global variable we can use this keyword
	
	
	//interview question: add a local and global variable
	
	int a=2;//global variable
	
	public void getData()
	{
		int a=3;//local variable
		System.out.println(a);
		System.out.println(this.a);
		int b= a+this.a;
		System.out.println("Sum of local and global variable:" +" "+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td=new ThisDemo();
		td.getData();
	}

}
