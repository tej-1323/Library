//package MarvellousCollection;
package Packagedemo3;
import java.lang.*;
import java.util.*;
class Node <T>
{
	public T data;
	public Node next;
	
	public Node(T value)
	{
		data=value;
		next=null;
	}
}
public class SinglyCircularLinkedList <T>
{
	public Node Head;	
	public Node Tail;
	
	public SinglyCircularLinkedList()
	{
		Head=null;
		Tail=null;
	}
	public void InsertFirst(T no)
	{
		Node newn=new Node(no);
		
		if(Head==null && Tail==null)
		{
			Head=newn;
			Tail=newn;
		}
		else
		{
			newn.next=Head;
			Head=newn;
		}
		Tail.next=Head;
	}
	public void InsertLast(T no)
	{
		Node newn=new Node(no);
		if(Head==null && Tail==null)
		{
			Head=newn;
			Tail=newn;
		}
		else
		{
			Tail.next=newn;
			Tail=newn;
		}
		Tail.next=Head;
	}

	public void DeleteFirst()
	{
		if(Head==null && Tail==null)
		{
			return;
		}
		if(Head==Tail)
		{
			Head=null;
			Tail=null;
			return;
		}
		else
		{
			Head=Head.next;
			Tail.next=Head;
		}
	}
	public void DeleteLast()
	{
		if(Head==null && Tail==null)
		{
			return;
		}
		if(Head==Tail)
		{
			Head=null;
			Tail=null;
			return;
		}
		else
		{
			Node temp=Head;
			while(temp.next!=Tail)
			{
				temp=temp.next;
			}
			Tail=temp;
			Tail.next=Head;
		}
	}
	public void InsertAtPos(int pos,T val)
	{
		int size=Count();
		if((pos <1 )||(pos > (size+1)))
		{
			return;
		}
		if(pos==1)
		{
			InsertFirst(val);
		}
		else if(pos==(size+1))
		{
			InsertLast(val);
		}
		else
		{
			Node newn=new Node(val);
			Node temp=Head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			//newn.next=null;
			newn.next=temp.next;
			temp.next=newn;
		}
	}
	public void DeleteAtPos(int pos)
	{
		int size=Count();
		if((pos<=0)||(pos>size))
		{
			return;
		}
		if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==(size))
		{
			DeleteLast();
		}
		else
		{	
			Node temp=Head;
			Node temp2=null;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp2=temp.next;
			temp.next=temp2.next;
		}
	}
	public void Display()
	{
		System.out.println("Elements of linked list");
		Node temp=Head;
		if((Head==null) && (Tail==null))
		{
			return;
		}
		do
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;
		}while(temp!=Head);

		System.out.println();
	}
	public int Count()
	{
		int cnt = 0;
    
   		if((Head == null) && (Tail == null))
   		{
   		    return 0;
    	}   
    	do
    	{
    	    cnt++;
    	    Head = Head.next;
   		}while(Head!= Tail.next);
    	return cnt;
	}
}
