import java.util.Arrays;

public class bubble {
static void bs(int[] arr,int start,int end) {
        if (end==0)
                return;
        if (start<end)
                {
                    if (arr[start]>arr[start+1])
                    {
                            int temp=arr[start];
                            arr[start]=arr[start+1];
                            arr[start+1]=temp;
                    }

                    bs(arr,start+1,end);

                }
                else
                bs(arr,0,end-1);

        }


    public static void main(String[] args) {
    int[] arr={1,4,3,2,0};
        bs(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int[] sortArray(int[] nums) {

        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int arr[],int start,int end)
    {
        if(end-start==1)
        {
            return;
        }
        int mid=start+(end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);

    }
    public void merge(int arr[],int start,int mid,int end )
    {
        int[] mix=new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid &&j<end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid)
        {
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<end)
        {
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++)
        {
            arr[start+l]=mix[l];
        }
    }
}
