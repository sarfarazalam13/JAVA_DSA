import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        String str=in.nextLine();
        System.out.println(pall(str));
    }
    static boolean pall(String str)
    {
       if(str.length()==0 ||str==null)
       {
           return true;
       }
        str=str.toLowerCase();
        int x=str.length();
        for (int i=0;i<x-1/2;i++)
        {
            int start=i;
            int end=x-1-i;
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }

        }
        return true;
    }
}
