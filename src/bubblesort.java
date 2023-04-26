import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
                /*new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }*/
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }

        }

    }
}
