public class stackdynamic extends stack{
    stackdynamic()
    {
        super();
    }
    stackdynamic(int size)
    {
        super(size);
    }

    @Override
    public void push(int val) throws Exception {
        if(isFull())
        {
           int[] temp=new int[arr.length*2];
           for (int i=0;i<arr.length;i++)
           {
               temp[i]=arr[i];
           }
           arr=temp;

        }
        super.push(val);
    }
}

class implh
{
    public static void main(String[] args) throws Exception {
        stackdynamic s=new stackdynamic(7);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);
        s.push(17);
        s.push(19);
        s.push(120);
        s.push(190);

        System.out.println(s.isFull());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
