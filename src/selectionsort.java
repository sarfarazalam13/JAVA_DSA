import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arra[]={-2,-1,0,7,-7};
        sort(arra);
        System.out.println(Arrays.toString(arra));

    }
    static void sort(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            int maxIndex= max(arr,0,arr.length-i);
           swap(arr,maxIndex,arr.length-1-i);

        }

    }
    static int max(int arr[],int s,int e)
    {

        int mi=0;
        for(int i=0;i<e;i++)
        {
            if(arr[i]>arr[mi])
            {
                mi=i;
            }
        }
        return mi;
    }
    static void swap(int arr[],int maxIndex,int last)
    {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;

    }
}

