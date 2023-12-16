package string;

public class StringImportantTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is immutable
		
		String a= "hello";
		String b= "hello";
		String h= new String("hello");
		String h1= new String("hello");
		a.concat("world");
		String s=a.concat(" Hi");
		System.out.println(a.concat("world"));// it will print hello
		System.out.println(s);
		
		//why
		/* String is immutable 
		 * here the original content of a i.e hello will not change because b is also pointing to the same object
		 * so amra jokhon a.concat korbo and a print korbo it will print hello but jokhn a.concat k direct print korbo then hello world print korbe
		 * here we can create another new string s= a.concat("hello")
		 * if content is same then only one memory is allocated in case we create string through strin literals
		 */
		
		
		/* difference between == and equals */
		//equals method compare the content in the Strings
		// ==  here content is not matched here if a and b refer to same object then it returns true
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println(a.equals(h));
		System.out.println(a==h);
		
		System.out.println(h==h1);//here though the content are same but both are different object so it will return false since references are difference
		System.out.println(h.equals(h1));//it will return true since equals only compare the content and both the content are same
		
		
		

	}

}
