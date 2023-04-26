public class middleofLinkedList {
    node head;
    node next;
    int size;

    middleofLinkedList() {
        size = 0;
    }

    class node {
        node next;
        int val;

        node(int val) {
            this.val = val;
        }
    }

    void insert(int val) {
        if (size == 0) {
            node n = new node(val);
            n.next = head;
            head = n;
            size++;

        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new node(val);
            size++;
        }
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    node mid(node head)
    {
      node slow=head;
      node fast =head;
      while(fast!=null && fast.next!=null)
      {
          slow=slow.next;
          fast=fast.next.next;
      }
      return slow;
    }

}
class main
{

    public static void main(String[] args) {
        middleofLinkedList x=new middleofLinkedList();
        x.insert(1);
        x.insert(2);
        x.insert(3);
        x.insert(4);
        x.insert(5);
        x.display();
         x.mid(x.head);

    }
}
