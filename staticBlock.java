package ArraysListInJavaAllProgram;

public class staticBlock 
{
	static {
		System.out.println("hello static block one");
	}
	public static void main(String []vishalrai)
	{
		System.out.println("hello world");
		new staticBlock();
		new staticBlock();
		new staticBlock();
		new staticBlock();
		
	}
	{
	System.out.println("non static block ");
	}

}
