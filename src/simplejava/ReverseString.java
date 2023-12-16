package simplejava;

public class ReverseString {
	//first way by using string buffer class
	
	public static void main(String[]args)
	{
		String str="Ankita";
		//#1:Using String buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("reserved String: "+sb.reverse().toString());
		
		//Without using string buffer,we will fecth character by character
		//we have to itirate from last character
//		String result1="";
//		for(int i=str.length()-1;i>=0;i--)
//        {
//			 result1=result1+str.charAt(i);
//		}
//		System.out.println(result1);
	}
	
}
