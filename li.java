import java.util.*;

class Node{
    int data;
    Node next;
}
 class Linked{
    Node head;
    public void deletelast(){
        Node x=head;
        Node y=head.next;
        
            while(y.next!=null)
            {y=y.next;
                x=x.next;
            }
            x.next=null;
        
    }
   public void inserthead(int a){
      Node k=new Node();
      k.data=a;
      k.next=head;
      head=k;
    }
    public void add(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
    
        if(head==null)
        {
         head=node;
        }
        else{
            Node t;
            t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=node; }
    
    }
    public void delatindex(int m)
    {
        Node x=head;
        Node y=head.next;
        while(m-->1)
        {
            x=x.next;
            y=y.next;
        }
        x.next=y.next;
    }
    public void show()
    {
        Node k=head;
        while(k!=null)
        {
            System.out.print(k.data+" ");
            k=k.next;
        }
    }
    public void insertatindex(int x,int i){
        Node t=head;
        Node k=new Node();
        k.data=x;
        while(i-->2)
        {
            t=t.next;
        }
        k.next=t.next;
        t.next=k;

    }
    }
    
public  class ll{
public static void main(String[] args) {
    Linked list=new Linked();

    list.add(50);
    list.add(5);
    list.add(6);
    list.inserthead(9);
    list.show();System.out.println();
    list.deletelast();
    list.show();
System.out.println();
list.add(3);
list.add(5);
list.show();System.out.println();
list.delatindex(2);
list.show();System.out.println();
list.insertatindex(152,2);
list.show();
System.out.println();
}}