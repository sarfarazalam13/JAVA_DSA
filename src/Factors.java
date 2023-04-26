public class Factors {
    public static void main(String[] args) {

        fact(36);
    }
    static void fact(int n)
    {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" "+n/i);
            }

        }
    }
}
