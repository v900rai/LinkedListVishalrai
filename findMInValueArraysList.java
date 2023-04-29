package ArraysListInJavaAllProgram;

import java.util.ArrayList;

public class findMInValueArraysList 
{
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		System.out.println(list);
		
		int min=Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++)
		{
			if(min>list.get(i))
			{
				min=list.get(i);
			}
		}
		System.out.println("min element "+min);
		
	}

}
