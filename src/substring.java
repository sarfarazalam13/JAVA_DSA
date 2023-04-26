public class substring {
    public static void main(String[] args) {
        String x="abc";
        substr("",x);
    }
    static void substr(String p,String u)
    {
        if(u.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=u.charAt(0);
        substr(p+ch,u.substring(1));
        substr(p,u.substring(1));
    }
}
