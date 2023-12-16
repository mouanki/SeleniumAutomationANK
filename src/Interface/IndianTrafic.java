package Interface;

public class IndianTrafic implements centralTrafic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralTrafic It=new IndianTrafic();//this will not able to access indiaRule since it will only implement the methods present in interface
		IndianTrafic It2=new IndianTrafic();//this object is specific to the class it can acess all the methods including class own method and the methods of the interface
		
		
		It.green();
		It.red();
		It.yellow();
		It2.indiaRule();
		It2.yellow();
		
		
	}

	@Override
	public void green() {
		System.out.println("Go");
		
	}

	@Override
	public void red() {
		System.out.println("Stop");
		
	}

	@Override
	public void yellow() {
		System.out.println("Slow");
		
	}
	public void indiaRule()
	{
		System.out.println("For india");
	}

}
