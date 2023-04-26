public class binaryStringd {
    public static void main(String[] args) {
        System.out.println(Sol("11","1"));

    }
    static String Sol(String a,String b)
    {

        int sum = Integer.parseInt(a,2)+Integer.parseInt(b,2);
        return Integer.toBinaryString(sum);
    }
}
