package SCLL;
import Packagedemo3.SinglyCircularLinkedList;
import java.lang.*;
import java.util.*;
public class scll
{
    public void Display()
    {
        SinglyCircularLinkedList<Integer> obj = new SinglyCircularLinkedList<Integer>();
        Scanner sobj = new Scanner(System.in);
        int choice = 1;
        int value = 0,pos=0;
        while(choice != 0)
        {
            System.out.println("****************************************************");
            System.out.println("Enter your choice");
            System.out.println("****************************************************");
            System.out.println("1 : Insert First");
            System.out.println("2 : Insert Last");
            System.out.println("3 : Delete First");
            System.out.println("4 : Delete Last");
            System.out.println("5 : Display");
            System.out.println("6 : Count");
            System.out.println("7 : insert at pos");
			System.out.println("8 : delete at pos");
			System.out.println("0 : Exit");
            System.out.println("****************************************************");
            choice = sobj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value");
                    value = sobj.nextInt();
                    obj.InsertFirst(value);
                    break;
                case 2:
                    System.out.println("Enter the value");
                    value = sobj.nextInt();
                    obj.InsertLast(value);
                    break;
                case 3:
                    obj.DeleteFirst();
                    break;
                case 4:
                    obj.DeleteLast();
                    break;
                    
                case 5:
                    obj.Display();
                    break;
				case 6:
					System.out.println("no of elemnts are:"+obj.Count());
					break;
				case 7:
					System.out.println("Enter value");
					value=sobj.nextInt();
					System.out.println("Enter pos");
					pos=sobj.nextInt();
					obj.InsertAtPos(pos,value);
					break;
			case 8:
				System.out.println("Enter pos");
				pos=sobj.nextInt();
				obj.DeleteAtPos(pos);
				break;
			}
		}
		System.out.println("....thank u for using singly circular linked list.....");
		obj.Head=null;
	}
}