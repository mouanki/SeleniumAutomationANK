package simplejava;

public class ReverseWordsInSentence {
	public static void main(String[] args)
	{
		String str="My name is ankita ray";
		//output should be "java learning am I"
		String[] arr= str.split(" ");
		String result="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			result=result+arr[i]+" ";
		}
		System.out.println(result);
	}
}
