public class evenoddbitwise {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }
    static boolean isOdd(int x)
    {
        return (x&1)==1;
    }
}
