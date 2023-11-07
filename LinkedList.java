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

    //removing first element in the linked list
    public int removeFirst()
    {
        int val=0;
        if(head==null)
        {
            System.out.println("Empty Linked list");
            val = Integer.MIN_VALUE;
        }
        else if(head.next==null)
        {
            size--;
           val=head.data;
           head=tail=null;

        }
        else
        {
            size--;
            val=head.data;
            head=head.next;
        }
        return  val;
    }

   //removing last element in the linked list
   public int removeLast()
   {
    int val=0;
    if(head==null)
        {
            System.out.println("Empty Linked list");
            val = Integer.MIN_VALUE;
        }
       else if(head.next==null)
        {
            size--;
           val=head.data;
           head=tail=null;

        }
        else
        {
            size--;
            val=tail.data;
            Node temp=head;
            while(temp.next.next != null)
            {
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
        } 
        return val;
   }

   public int Search(int key)
   {
    Node temp=head;
    int index=1;
    while(temp!=null)
    {
        if(temp.data==key)
        {
            return index;
        }
        else
        {
         index++;
         temp=temp.next;
        }
       
    }
    return -1; 
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(58);
        ll.addLast(86);
        ll.addLast(77);
        ll.addLast(89);
        ll.addLast(92);
        ll.addLast(102);
        ll.printLinkedList();
        // ll.addLast(4);
        // ll.printLinkedList();
        // ll.addMiddle(5);
        // ll.printLinkedList();
        // System.out.println("\nSize of the linked list is: "+size);
        // int deletedNode=ll.removeFirst();
        // System.out.println("\ndeleted node is: "+deletedNode);
        // System.out.println("\nSize of the linked list is: "+size);
        // ll.printLinkedList();
        // System.out.println("\ndeleted node is: "+ll.removeLast());
        // ll.printLinkedList();
        // System.out.println("\nSize of the linked list is: "+size);
        int result=ll.Search(58);
        if(result==-1)
        {
          System.out.println("\nKey not found");
        }
        else
        {
          System.out.println("\nKey found at index: "+result);
        }
        
    }
}