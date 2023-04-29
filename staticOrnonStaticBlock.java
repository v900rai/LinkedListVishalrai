package ArraysListInJavaAllProgram;

public class staticOrnonStaticBlock 
{
	static {
		System.out.println("static block of class A");
	}
	{
		System.out.println("nob static block of class A");
	}

	
	
	public static void main(String []args)
	{
		System.out.println("main method started");
		new staticOrnonStaticBlock();
		
	}
	static 
	{
		System.out.println("static block of Minclass ");
		
	}
	{
	System.out.println("non static block of  mainclas");
	}  
	}

