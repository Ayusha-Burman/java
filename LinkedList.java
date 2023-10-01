import java.util.*;
public class LinkedList {
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //instance variables
    public static Node head;
    public static Node tail;
    public static int size;

    // Add element at First
    public void addFirst(int data)
    {
        //step 1: create a new node
        Node newNode = new Node(data);
        size++;
       if(head==null)
       {
        head=tail=newNode;
       }
       //step 2: newNode.next = head 
       newNode.next=head;

       //step 3:head = new node
       head=newNode;
    }

    //Add element at Last
    public void addLast(int data)
    {
        //step 1: create new node
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }

        //step 2: tail.next=new node
        tail.next=newNode;

        //step 3: tail=new node
        tail=newNode;

    }

    //print elements of a linked list
    public void printLinkedList()
    {
        Node tempNode=head;
        if(head==null)
        {
            System.out.println("\nLinkedlist is empty\n");
        }
        else
        {
           System.out.println("Printing Linked List");
           while(tempNode.next != null)
           {
             System.out.print(tempNode.data+"->");
             tempNode=tempNode.next;
           }
           System.out.print(tempNode.data);
        }
        
    }

    //add in the middle
    public void addMiddle(int data)
    {
        System.out.println();
        Scanner sc=new Scanner(System.in);
       
        if(head==null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            System.out.println("Where do you want to add the item? ");
            int target=sc.nextInt();
            Node tempNodee=head;
            Node temp=new Node(data);
            size++;
            temp.data=data;
            temp.next=null;
            for(int i=1;i<target-1;i++)
            {
                tempNodee=tempNodee.next;
            }
           temp.next=tempNodee.next;
           tempNodee.next=temp;

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLinkedList();
        ll.addMiddle(5);
        ll.printLinkedList();
        System.out.println("\nSize of the linked list is: "+size);
    }
}
