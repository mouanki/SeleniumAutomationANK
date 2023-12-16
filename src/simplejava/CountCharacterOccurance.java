package simplejava;

public class CountCharacterOccurance {

	//count the occurance of "a" in the given string
	//Step1-find the length of the original String
	//Step2- replace "a" in the original String
	//Step3- Find the length of the resultant String 
	//Substarct the original-resultant length
	public static void main(String[] args)
	{
		String str="I am learning java";
		int originalLength=str.length();
		String newStr=str.replace("a", "");
		int newstrlenth=newStr.length();
		int occuranceOfa=originalLength-newstrlenth;
		System.out.println(newStr);
		System.out.println(occuranceOfa);
		System.out.println(originalLength);
		
	}
}
