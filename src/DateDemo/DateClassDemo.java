package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/YYYY");
		
		System.out.println(sdf.format(d));
		
	}

}
