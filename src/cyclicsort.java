import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int arr[]={4,2,1,3};//should be in range of 1 to n,for  0 to n-1 we need to modify th program
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {i++;}

        }

    }
    static void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
