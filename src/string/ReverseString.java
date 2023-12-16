package string;

public class ReverseString {

	public static void main(String[] args) {
		String s="rahul";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 reverse=reverse+s.charAt(i);
			
		}
   System.out.println(reverse);
	}

}
