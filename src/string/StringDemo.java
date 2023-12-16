package string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is a java class
		// by 2 ways we can declare a string in java
		// 1) by String literal and 2) by creating an object

		String a = "hello"; // String literals
		// for a java will do the job in backend as String a= new String("hello")
		// now
		String b = "hello";// here java will search for hello string in string pool if hello string is
							// already defined
		// if already defined then it will refer to the same object

		String ab = new String("hello");// by creating object
		String b1 = new String("hello");//here we are explicitly telling java to create a new object so it will create b with hello value;
		
		int s=5;// it will only assign 5 to s nothing will happen in backend 

	}

}
