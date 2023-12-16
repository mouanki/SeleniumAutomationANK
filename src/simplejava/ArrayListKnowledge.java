package simplejava;

import java.util.ArrayList;

public class ArrayListKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dynamic array is arraylist 
		//it will changfe the size dynamically
		//Arraylist class comes from util package
        ArrayList<String> a=new ArrayList<String>();
        a.add("Rahul");
        a.add("Anki");
        //get the value
        //for loop
        for(int i=0;i<a.size();i++)
        {
        	System.out.println(a.get(i));
        }
        //or 
        for(String s:a)
        {
        	System.out.println(s);
        }
        
		
		
	}

}
