package simplejava;

public class PalindromeString {
	public static void main(String[]args)
	{
		String str="rotator";
		System.out.println(str.length());
		boolean result=isPalindrome(str);
		System.out.println(str+ "ispalindrome:="+result);
	}

	private static boolean isPalindrome(String str) {
//		String originalString=str;
//		String newString="";
//		for(int i=str.length()-1;i>=0;i--) 
//		{
//			newString=newString+str.charAt(i);	
//			
//		}
//		if(newString.equalsIgnoreCase(originalString))
//		{
//		return true;
//		}
//		else
//			return false;
//	}
		//by recursion method i.e a function calling itself
		if(str==null)
			return false;
		if(str.length()<=1)
			return true;
		String firstcha=str.substring(0,1);
		String lastcha=str.substring(str.length()-1, str.length());
		if(!firstcha.equals(lastcha))
		{
			return false;
		}
		else
			System.out.println(str.length());
		System.out.println(str);
			return isPalindrome(str.substring(1,str.length()-1));
		
	}
			
}
