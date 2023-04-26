import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int arr[])
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    static int[] merge(int left[],int right[])
    {
        int arr[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            arr[k]=right[j];
            k++;
            j++;
        }
        return arr;
    }
}
