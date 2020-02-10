package coreJava;

public class constructorDemo {
	
		public constructorDemo()
	{
		System.out.println("Inside constructor ");
	}
		
		public constructorDemo(int a , int b)
		{
			System.out.println("Inside parameterised constructor ");
		}
		
	

	public void getData()
	{
		System.out.println("Inside method ");
	}
	public static void main(String[] args)
	
	{
		constructorDemo cd = new constructorDemo();
		constructorDemo c = new constructorDemo(4,5);
	}
	

}
