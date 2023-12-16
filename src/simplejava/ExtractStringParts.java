package simplejava;

public class ExtractStringParts {
	
	public static void main(String[]args)
	{
		String str="www.abc.com";
		//www.: fisrt3 charachter
		//.com : last four
		//here we will use substring method of string class
		String firstfour=str.substring(0, 4);
		System.out.println(firstfour);
		//substring method include first index i.e 0 and endIndex is exclusive i.e 4)
		String lastfour=str.substring(str.length()-4, str.length());
		System.out.println(lastfour);
		
	}
}
