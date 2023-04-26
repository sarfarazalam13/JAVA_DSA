import com.sun.jdi.PathSearchingVirtualMachine;

class SoluQ {
    static public class ListNodee {
 int val;
     ListNodee next;
    ListNodee() {}
      ListNodee(int val) { this.val = val; }
      ListNodee(int val, ListNodee next) { this.val = val; this.next = next; } }

    public ListNodee rotateRight(ListNodee head, int k) {
        ListNodee temp=head;
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        temp.next=head;
        int x=size-k;
        while(x--!=0)
        {
            temp=temp.next;
        }
        temp.next=null;
        return temp;
    }

    public static void main(String[] args) {
        ListNodee l=new ListNodee(1);


    }
}