import java.util.Scanner;

public class SeiveofErathobess {
    static void primes(int n)
    {
        boolean p[]=new boolean[n+1];
        for(int i=0;i<n+1;i++)
        {
            p[i]=true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(p[i]==true) {
                for(int j=i*i;j<=n;j+=i)
                {
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(p[i]==true) {
                System.out.println(i);
            }
        }
        }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        primes(x);
    }
    }



