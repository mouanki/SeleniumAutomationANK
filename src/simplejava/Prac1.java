package simplejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Prac1 {

	public static void main(String[] args) {
        String s="I am Ankita and I love love India";
        String[] s1=s.split(" ");
        Map<String,Integer> map=new HashMap<String,Integer>();
        int count =1;
        for(int i=0;i<s1.length;i++)
        {
        if(!map.containsKey(s1[i]))
        {
            map.put(s1[i],count);
            
        }
        else
        {
            map.put(s1[i],map.get(s1[i])+1);
        }
        }
        for(String c:map.keySet())
        {
            System.out.println("count of "+ c +"is"+" "+ map.get(c));
        }
        System.out.println("This I am doing for Git Push");
    }

}
