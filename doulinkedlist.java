import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Double
{
    Node head;
    public Double()
    {
        this.head=null;
    }
   public void insertnode(int data)
   {
       Node newNode = new Node(data);
       if(head==null)
       {
           head=newNode;
       }
       else
       {
           Node temp = head;
           while (temp.next != null)
           {
               temp = temp.next;
           }
           temp.next = newNode;
           newNode.prev = temp;
       }
   }
    public void delete(int key)
    {
        Node current = head;

        while (current != null)
        {
            if (current.data == key) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                System.out.println("Element " + key + " deleted from the list.");
                return;
            }

            current = current.next;
        }

        System.out.println("Element " + key + " not found in the list.");
    }
   public void display()
   {
       Node temp=head;
       System.out.println("Elements in the list:");
       while(temp!=null)
       {
           System.out.println(temp.data+ "");
           temp=temp.next;
       }
   }
}
public class Main
{
    public static void main(String[]args)
    {
        Double o=new Double();
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the no of elements in the list:");
        int num=n.nextInt();
        int i;
        System.out.println("Enter the elements of list:");
        for(i=0;i<num;i++)
        {
            int element=n.nextInt();
            o.insertnode(element);

        }
        o.display();
        System.out.println("Enter the element to be deleted:");
        int key=n.nextInt();
        o.delete(key);
        o.display();

    }

}
