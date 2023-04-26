class stack {
     int arr[];
    private int pointer=-1;
    private static final int DEFAULT_SIZE=10; //if size of array is not defined then default size 10 is taken here
    stack()
    {
        this.arr=new int[DEFAULT_SIZE];
    }
    stack(int size)
    {
        this.arr=new int[size];
    }

    public void push(int val) throws Exception
    {
        if(pointer==arr.length-1)
        {
            throw new Exception("stack is already full");
        }
        pointer++;
        arr[pointer]=val;
    }

    public int pop() throws Exception {
        if(pointer==-1)
        {
            throw new Exception("cannot pop from empty stack");
        }
        return arr[pointer--];
    }
    public int peek()
    {
        return  arr[pointer];
    }

    public boolean isFull()
    {
        if(pointer==arr.length-1)
        {
            return true;
        }
        return false;
    }
}

class impl
{
    public static void main(String[] args) throws Exception {
        stack s=new stack(7);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);
        s.push(17);
        s.push(19);

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
