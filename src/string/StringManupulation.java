package string;

public class StringManupulation {

	public static void main(String[] args) {

		String str = "automationApiTest";
		// replaceall(characters to be replaces, by what)
		
		String modifiedStr = str.replaceAll("[Ai]", "");
		System.out.println("Original String: " + str);
		System.out.println("Modified String: " + modifiedStr);

		
		//charAt(index)
			System.out.println( str.charAt(2));
			
		//indexof("character")	
			System.out.println( str.indexOf("a"));//gives the first index of a
			
		//substring methods	
			System.out.print(str.substring(4));//here it will print starting from 4th index to last
			
			System.out.println( str.substring(0, 5));//here it will print from 0th index till 4th index 5th is exclusive
			
			
		//trim()
			
			//trims the spaces from right left
			
			String a=" Ankita ";
			System.out.println(a.trim());
			
		//split(" ")
			
			String s="ankitaRay";
			String[] arr=s.split("a");//it will slit based on "a" and store it in an array
			
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
		
		//replace("a","s")
			
			System.out.println(s.replace("a", "s"));
			
		//concat("string")
			
			System.out.println(s.concat("hello"));
			
		// concat can be done through + operator also	
			
			//strip() method
			String ar=" ankita ray\t";
			System.out.println(ar.trim());
			
			String ar2=" ankita ray\t";
			System.out.println(ar2.strip());
			
					
			
			
	}

}
