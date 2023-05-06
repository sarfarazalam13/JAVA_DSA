import java.util.Scanner;

class numofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = new int[n];

        for (int i =0;i<n;i++){
            ar[i]= sc.nextInt();
        }

        int count=0;
        for (int i =0;i<n;i++){
            //int num = ar[i];
            int c =0;
            while (ar[i] >0){
                c++;
                ar[i]=ar[i]/10;
            }
            if (c%2==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
