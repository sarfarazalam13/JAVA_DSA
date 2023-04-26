public class digitsum {
    public static void main(String[] args) {
        int x=33;
        System.out.println(add(x));
    }
    static int add(int n)
    {
        return 1+(n-1)%9 ;
    }
}
