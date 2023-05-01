public class swapNodesinpairs {
    private node head;

    class node
    {
        int val;
        node next;
        node(int val)
        {
            this.val=val;
        }
        node(int val,node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    void addNOde(int val)
    {
        node newnode=new node(val);
        if(head==null)
        {
            head=newnode;
        }
        else {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void displaylink()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    void swapnodes()
    {
        node dummy=new node(0,head);
        swap(dummy);
        displaylink();
    }
    void swap(node head)
    {
        if(head==null)
        {
            return;
        }
        node first=head.next;
        node second=null;
        if(first!=null)
        {
           second=first.next;
        }
        if(second!=null)
        {
            node secondNext=second.next;

        }

    }

}
class man
{
    public static void main(String[] args) {
        swapNodesinpairs s=new swapNodesinpairs();

        s.addNOde(13);
        s.addNOde(14);
        s.addNOde(15);
        s.addNOde(16);
        s.addNOde(17);

        s.displaylink();
        s.swapnodes();
    }
}
