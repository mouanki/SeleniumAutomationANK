package simplejava;

public class StringKnowledge {

	public static void main(String[] args) {
		//string is an object that represents sequence of characters
		// for String memory will be allocated only once in java for same String values
		//if we are creating string with new keyword and in that case if the values are same then it will occupy seperate memory because we are explicitly giving new
		//We can define string in two ways -- by String literal -- by new keyword
		//Eg
		String s1="Hello";
		String s2="Ankita";
		String s3="Ankita";
		//for Ankita only one memory will be allocated
		//By new keyword
		String s4=new String("Welcome");// for Welcome 2 different memory allocation will be done since we used new keyword
		String s5=new String("Welcome");
		String s6=new String("Hello world");
		
        // string methods and operations
		//Split -- split method split the string on basis of the input and returns an String array
		String s7="rahul shetty academy";
//		String [] splittedString= s7.split("am");
//		System.out.println(splittedString[1]);
//		//trim -- to trim the left and right spaces
//		System.out.println(splittedString[1].trim()); 
//		//Now if we want to print each character of the words in s7
		for (int i=0;i<s7.length();i++)
		{
			System.out.print(s7.charAt(i));
		}
		System.out.println("\n"+"**********************");
		//Printing in reverse order each character
		for (int i=s7.length()-1;i>=0;i--)
		{
			System.out.print(s7.charAt(i));
		}
		
		
		

	}
        
}
