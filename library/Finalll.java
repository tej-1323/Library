import SLL.sll;
import DLL.dll;
import SCLL.scll;
import DCLL.dcll;
import java.lang.*;
import java.util.*;
class Finalll
{
    public static void main(String arg[]) throws Exception
    {
     
        Scanner sobj = new Scanner(System.in);
        int choice = 1;
        int value = 0,pos=0;
        while(choice != 0)
        {
            System.out.println("****************************************************");
            System.out.println("Enter your choice:");
            System.out.println("****************************************************");
            System.out.println("1 : Singly Linked List");
            System.out.println("2 : Doubly Linked List");
            System.out.println("3 : Singly circular Linked List");
            System.out.println("4 : Doubly circular Linked List");
            System.out.println("5 : Stack");
            System.out.println("6 : Queue");
			System.out.println("0 : Exit");
            System.out.println("****************************************************");
            choice = sobj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(".........SinglyLinkedList.........");
                    sll OBJ1=new sll();
                    OBJ1.Display();
                    break;
                case 2:
                    System.out.println(".........DoublyLinkedList..........");
                    dll OBJ2=new dll();
                    OBJ2.Display();
                    break;
                case 3:
                    System.out.println(".........SinglyCircularLinkedList..........");
                    scll OBJ3=new scll();
                    OBJ3.Display();
                    break;
                case 4:
                    System.out.println(".........DoublyCircularLinkedList..........");
                    dcll OBJ4=new dcll();
                    OBJ4.Display();
                    break;
			}
		}
		System.out.println("  thank u for Data structure library..!");
        System.out.println("****************************************************");
		
	}
}