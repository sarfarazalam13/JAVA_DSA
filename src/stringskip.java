public class stringskip {
    public static void main(String[] args) {
        String s="abbacappledab";
        System.out.println(skip(s));

    }
    static String skip(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith("apple"))
        {
            return skip(s.substring(5));
        }
        else
        {
            return s.charAt(0)+skip(s.substring(1));
        }
    }
}
