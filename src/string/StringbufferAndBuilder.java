package string;

public class StringbufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String Buffer and Builder both are String Classes which are mutable both have
		 * similar methods diff is String Buffer is thread safe and builder is not
		 * thread safe String buffer does not allow multiple threads/programe to act on same String on same time
		 * Since String Bufferis thread safe it is slower than builder
		 * if our Automation framework supports parallel execution then it is better to use thread safe i.e buffer
		 * 
		 */
		/*
		 * by using string buffer we dont need to create a new string and assign
		 * sb.append("world") , unlike normal String class it will append in the
		 * original content Any modification in the original content can be done
		 */

		StringBuffer sb = new StringBuffer("ankita");
		sb.append(" World");
		System.out.println(sb);
		sb.insert(3, "She");

		System.out.println(sb);

		sb.replace(2, 4, "aa");
		System.out.println(sb);

		sb.deleteCharAt(5);

		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

	}

}
