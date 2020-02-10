package coreJava;

public class childDemo extends parentdemo{
	
	String name="Patil";
	
	public childDemo()
	{	super();
		System.out.println("child class construtor");
	}
	public void getStringdata()
	{
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData()
	{
		System.out.println("I am in child class");
	}
	
	public static void main(String[] args)
	{
		childDemo child = new childDemo();
		child.getStringdata();
		child.getData();
	}

}
