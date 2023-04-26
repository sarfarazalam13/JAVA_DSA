public class doublyll {
    node head;
    node next;
    node prev;
    int size;
    class node
    {
        int val;
        node next;
        node prev;
        node(int val)
        {
            this.val=val;
        }
    }
    void insert(int val)
    {
        if(size==0)
        {
            node n=new node(val);
            n.next=head;
            n.prev=null;
            if(head!=null)
            {
                head.prev=n;
            }
            head=n;
            size++;
        }
        else {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next =new node(val);
            size++;


        }
    }
    void display()
    {
        node temp=head;
        node last=null;
        while(temp.next!=null)
        {
            System.out.println(temp.val);
            last=temp;
            temp=temp.next;
        }
        System.out.println("reverse");
        while (last!=null)
        {
            System.out.println(last.val);
            last=last.prev;
        }
    }

    public static void main(String[] args) {
        doublyll dl=new doublyll();
        dl.insert(13);
        dl.insert(14);
        dl.insert(15);
        dl.insert(16);
        dl.display();
    }
}
