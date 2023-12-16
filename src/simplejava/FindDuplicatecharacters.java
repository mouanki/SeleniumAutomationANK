package simplejava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatecharacters {
	//we have to itirate character by character
	//have to store the count and if the count is greater than 1 then the character is duplicate
	//we will use hashmap to keep the key value
	public static void main(String[]args)
	{
		String str="anamika";
		char[] arr=str.toCharArray();//it will store each character in char array
		System.out.println(arr);
			
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Integer count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i], count);
				
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}
			
		}
	for (Character key:map.keySet()) 
	{
		if(map.get(key)>1) {
			System.out.println(key+ " "+map.get(key));
		}
	}
	}
}



