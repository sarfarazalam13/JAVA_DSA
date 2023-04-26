import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={5,4,6,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                    break;
            }
        }
    }
    static void swap(int arr[],int x,int y )
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
