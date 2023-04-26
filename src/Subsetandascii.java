import java.util.ArrayList;

public class Subsetandascii {
    public static void main(String[] args) {
        String x="abc";
        System.out.println(sub("","abc"));


    }
    static ArrayList<String> sub(String p,String u)
    {
        if(u.isEmpty())
        {
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=u.charAt(0);
        ArrayList<String> left=sub(p+ch,u.substring(1));
        ArrayList<String> right=sub(p,u.substring(1));
        ArrayList<String> ascii=sub(p+(ch+0),u.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
