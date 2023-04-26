public class Recursive {
    static void straight(int n)
    {
        if(n==0)
        {
            return ;
        }
        else {
            System.out.println(n);
            straight(n-1);
            System.out.println(n);

        }

    }
    public static void main(String[] args) {
        straight(5);

    }
}
