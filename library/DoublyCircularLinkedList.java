//package MarvellousCollection;
package Packagedemo4;
import java.lang.*;
import java.util.*;
class Node <T>
{
	public T data;
	public Node next;
	public Node prev;
	public Node(T value)
	{
		data=value;
		next=null;
		prev=null;
	}
}
public class DoublyCircularLinkedList <T>
{
	public Node Head;	
	public Node Tail;
	public DoublyCircularLinkedList()
	{
		Head=null;
		Tail=null;
	}
	public void InsertFirst(T no)
	{
		Node newn=new Node(no);
		
		if(Head == null && Tail==null)
		{
			Head = newn;
			Tail=newn;
		}
		else
		{
			newn.next=Head;
			Head.prev=newn;
			Head=Head.prev;	
		}
		Tail.next=Head;
		Head.prev=Tail;
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
			newn.prev=Tail;
			Tail=newn;
		}
		Tail.next=Head;
		Head.prev=Tail;
	}
	public void DeleteFirst()
	{
		if(Head==null && Tail==null)
		{
			return;
		}
		
		else if(Head==Tail)     // Single node
		{
			Head =null;
			Tail=null;
		}
		else                            // More than one node
		{
			Head =Head.next;
			
			Head.prev = Tail;
			Tail.next=Head;
		}
		
	}
	public void DeleteLast()
	{
		if(Head==null && Tail==null)
		{
			return;
		}
		else
		{
			if(Head==Tail)
			{
				Head=null;
				Tail=null;
			}
			else
			{
				Tail=Tail.prev;   
        
        		Head.prev =Tail;
        		Tail.next =Head;
			}
		}
	}
	public void InsertAtPos(int pos,T val)
	{
		int size=Count();
		if((pos<=0)||(pos > (size+1)))
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
			for(int i = 1; i<pos-1; i++)
			{
				temp = temp.next;
			}
            newn.next = temp.next;
			temp.next.prev = newn;
        
            temp.next = newn;
            newn.prev = temp;
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
		else if(pos==size)
		{
			DeleteLast();
		}
		else
		{
			Node temp = Head;
			for(int i = 1; i < pos-1;i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;

			temp.next.prev = temp;
		}
	}
	public void Display()
	{
		System.out.println("Elements of linked list");
	
		if((Head==null) && (Tail==null))
		{
			return;
		}
		do
		{
			System.out.print("|"+Head.data+"|->");
			Head=Head.next;
		}while(Head!=Tail.next);

		System.out.println();
	}
	public int Count()
	{
		int cnt=0;
		Node temp=Head;
		if((Head == null)&&(Tail == null))
    	{
   		     return 0;
    	}
    	do
    	{
    	    cnt++;
    	    Head = Head.next;
    	}while(Head!=Tail.next);
    	return cnt;
	}
}
