public class RecursiveGCD {
    public static void main(String[] args) {
        int t=recursive(100,30);
        System.out.println(t);

    }
    static int recursive(int n,int o)
    {
        if(o==0)
        {
            return n;

        }
        else
        {
            return recursive(o,n%o);
        }
    }
}
