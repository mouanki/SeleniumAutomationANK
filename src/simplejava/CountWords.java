package simplejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {
public static void main(String[]args)
{
	//to count number of occurrance of each word in a input string
	//we will use array and hashmap 
	//we will split the str on the basis of space and put it in an array
	//whenever we call split method of  a string it returns string array
String str= "I am learning learning java java java programing programing";
Map <String,Integer> map= new HashMap<String,Integer>();
Integer count=1;
String[] arr=str.split(" ");
for(int i=0;i<arr.length;i++)
{
	if(!map.containsKey(arr[i]))
			{
		map.put(arr[i], count);
			}
	else {
		map.put(arr[i], map.get(arr[i])+1);
		
	}
}
//Printing the output
for(String x:map.keySet()) 
{
	
	System.out.println("count of words  " +x+ "is  "+map.get(x));
}
}
}
