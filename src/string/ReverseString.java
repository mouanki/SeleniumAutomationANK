package string;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("for git from git x");
		String s="rahul";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 reverse=reverse+s.charAt(i);
			
		}
   System.out.println(reverse);
	}

}
