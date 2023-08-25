import java.util.Scanner;

public class NUM248 {
    public static void main(String args[])
    {
        int n,count=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=i,rem=0;
            int c2=0,c4=0,c8=0;
            while(x!=0)
            {
                rem=x%10;
                if(rem==2)
                {
                    c2++;
                }
                else if(rem==4)
                {
                    c4++;
                }
                else if(rem==8)
                {
                    c8++;
                }
                x=x/10;
            }
            if(c2==c4 && c4==c8 &&c2!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
        }
