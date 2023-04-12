  
class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}
class LL{
    Node head ;

     public void insert(int data)
     {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode; 
        }
        else
        {
            Node n = head;
            while(n.link!=null)
            {
                n=n.link;
            }
            n.link = newnode;
        }
     }

     public int find(int k)
     {
        Node n = head;
        int i=0;
        while(n.data!=k)
        {
            i++;
            n=n.link;
        }
        return i+1;
     }
}
class Main{
    public static void main(String[] args)
    {
        LL list = new LL();
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(56);
        list.insert(58);
        list.insert(92);
        list.insert(86);
        int k = list.find(56);
        System.out.print(k);
    }
}