public class permutations {
    public static void main(String[] args) {
        String a="abc";
        String b="";
        int i=0;
        permute(a,b,i);
    }
    static  void permute(String a,String b,int i)
    {
        if(i>=a.length())
        {
            System.out.println(b);
            return;
        }
        permute(a,b,i+1);

        b+=a.charAt(i);
        permute(a,b,i+1);
    }
}
