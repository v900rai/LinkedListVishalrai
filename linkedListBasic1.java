package linkedListDataStructure;

public class linkedListBasic1
{

	public static class Node{
		int data;// value
		Node next;// addres of next node
		Node(int data){
			this.data=data;
		}
	}
	public static  void main(String []args)
	{
		Node a=new Node(5);
		System.out.println(a.next);//null
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		///5 3 9 8 16
		a.next=b; //5..>3
		b.next=c; //5..>3..>9
		c.next=d; //5..>3..>9..>8
		d.next=e; //5..>3..>9..>8..>16
		System.out.println(d.next.data);
		
		
	}
}
