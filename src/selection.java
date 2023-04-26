import java.util.Arrays;

public class selection {
    static void selection(int[] arr,int start,int end,int max) {

        if (end==0)
            return;
        if (start<end)
        {
            if (arr[start]>arr[max])
            {
                selection(arr,start+1,end,start);
            }
            else
                selection(arr,start+1,end,max);

        }
        else
        {
            int temp=arr[max];
            arr[max]=arr[end-1];
            arr[end-1]=temp;

            selection(arr,0,end-1,0);
        }

    }


    public static void main(String[] args) {
        int[] arr={1,4,3,2,0};
        selection(arr,0,5,0);
        System.out.println(Arrays.toString(arr));
    }
}
