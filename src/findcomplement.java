public class findcomplement {
    public static void main(String[] args) {
        System.out.println(findComplements(5));

    }

    static int findComplements(int num) {
        for(long i=1;i<=num;i<<=1)

        {
            num^=i;
        }
        return num;

    }
}
