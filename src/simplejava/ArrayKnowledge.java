package simplejava;

import java.util.Arrays;
import java.util.List;

public class ArrayKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //create and initialize 
		//1st method
		int [] arr= new int[3];
		arr[0]=3;
		arr[1]=5;
		arr[2]=4;
		//or 2nd method
		int[] arr1= {3,5,4};
		//to print values
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		//array of strings
		String [] name= {"rahul","mina","hina"};
		//Printing value with enhanced forloop
		for(String s:name)
		{
			System.out.println(s);
		}
		
		//how to convert an array to arraylist
		List<String> nameList=Arrays.asList(name);
	}

}
