package simplejava;

import java.util.Arrays;

public class AnagramStrings {
	//first we have to convert the strings into lowercase and to character array
	//then we have to sort the arrays
	//then we have to check if equals or not based on which we can SAY IT IS ANAGRAM OR NOT
	
	public static void main(String[]args)
	{
		String str1="aaaaaa";
		String str2="Spot";
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}
	
}
