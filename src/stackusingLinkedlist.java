public class stackusingLinkedlist {
    n head;
    n next;
    int size;

    class n
    {
        n next;
        int val;
        n(int val)
        {
            this.val=val;
        }
    }
    public void push(int val)
    {
        n temp=new n(val);
        temp.next=head;
        head=temp;
    }
    public void pop()
    {
        System.out.println("item was popped"+head.val);
        head=head.next;
    }
    public void diplayElements()
    {
        n temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
class mani
{
    public static void main(String[] args) {
        stackusingLinkedlist sul=new stackusingLinkedlist();
        sul.push(10);
        sul.push(20);
        sul.push(30);
        sul.diplayElements();
        sul.pop();
        sul.pop();
        sul.diplayElements();
    }
}
