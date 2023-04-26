public class SumofDigits {
    public static void main(String[] args) {
        int t=numsum(123);
        System.out.println(t);

    }
    static int numsum(int n)
    {
        if(n==0)
            return 0;
        else
            return n%10+numsum(n/10);
    }
}
