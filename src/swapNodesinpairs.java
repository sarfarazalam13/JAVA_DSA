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
            while(temp!=null && temp.next!=null)
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
    }
}
