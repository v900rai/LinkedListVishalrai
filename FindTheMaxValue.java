package ArraysListInJavaAllProgram;

import java.util.ArrayList;

public class FindTheMaxValue 
{
	

	public static void main(String []args)
	{
		ArrayList<Integer> list=new  ArrayList<>();
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		int max=Integer.MAX_VALUE;
		for(int i=0; i<list.size(); i++)
		{
			if(max<list.get(i))
			{
				max=list.get(i);
			}
		}
		System.out.println("max element=..>  "+max+"  ");
		
	}

}
