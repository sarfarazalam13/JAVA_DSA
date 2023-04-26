public class smallestletterGreaterThanTarget {
    public static void main(String[] args) {
        char x=97;
        char[] arr={'c','f','j'};
        System.out.println(findchar(arr,'d'));
    }
    static char findchar(char[] arr,char target)
    {
        int s=0,e=arr.length-1,m=0;

        while(s<=e)
        {
             m=s+(e-s)/2;

             if(target<arr[m])
             {
                 e=m-1;
             }
             else
             {
                s=m+1;
             }
        }
        return arr[s%arr.length];
    }
}
