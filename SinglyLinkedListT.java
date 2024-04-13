import org.w3c.dom.Node;

public class SinglyLinkedListT {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    void addFirst(int d)
    {
        Node newnode=new Node(d);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    void addLast(int d)
    {
        Node newnode=new Node(d);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newnode;

    }
    void delFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    void delLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node last=head;
        Node prev=head;
        while(last.next!=null)
        {
            prev=last;
            last=last.next;
        }
        prev.next=null;

    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node last=head;
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last=last.next;
        }

    }
    public static void main(String[] args) {
        SinglyLinkedListT list=new SinglyLinkedListT ();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.delFirst();
        list.delLast();
        list.printList();

    }
}




