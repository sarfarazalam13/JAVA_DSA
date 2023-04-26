public class Reverseanumber {
    static int sum=0;
    static void rec(int n)
    {
        int r;
        if (n==0)
            return ;
        else
            r=n%10;
        sum=sum*10+r;
        rec(n/10);


    }
    public static void main(String[] args) {
        rec(123);
        System.out.println(sum);

    }
}
