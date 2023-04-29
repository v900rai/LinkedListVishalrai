package ArraysListInJavaAllProgram;

public class arrysSwap 
{
	public static void revers(int number[])
	{
		int first=0;int last=number.length-1;
		//swap number
		while(first<last)
		{
			//swap
			int temp=number[last];
			number[last]=number[first];
			number[first]=temp;
			first--;
			last++;
			
		}
	}
	public static void main(String []args)
	{
		int vishal[]= {1,4,5,89,66,5,3};
		revers(vishal);
		for(int i=0; i<vishal.length; i++)
		{
			System.out.print(vishal[i]+" ");
		}
		System.out.println();
	}

}
