import java.util.*;
class Node
{
  int data;
  Node link;

    Node (int data)
  {
    this.data = data;
    this.link = null;
  }
}

class LL
{
  Node head;

  public void insert (int data)
  {
    Node newnode = new Node (data);
    if (head == null)
      {
	head = newnode;
      }
    else
      {
	Node n = head;
	while (n.link != null)
	  {
	    n = n.link;
	  }
	n.link = newnode;
      }
  }

  public void delete ()
  {
    Node n = head;
    Node s = head.link;
    if (head.data > 25)
      {
	head = head.link;
      }
    while (n != null)
      {
	if (s.data > 25)
	  {
	    n.link = s.link;
	  }
	n = n.link;
	s = s.link;
      }
  }
  public void show()
  {
      Node n = head;
      while(n!=null)
      {
          System.out.print(n.data+" ");
          n=n.link;
      }
  }
}

class Main
{
  public static void main (String[]args)
  {
    Scanner r = new Scanner (System.in);
    int n = r.nextInt ();
    LL list = new LL ();
    int i = 0;
    for (i = 0; i < n; i++)
      {
	int k = r.nextInt ();
	  list.insert (k);
      }
    list.delete();
    list.show ();
  }
}
