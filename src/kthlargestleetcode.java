import java.util.Arrays;

class Solut {
    public static void main(String args[])
    {
        int arr[]={3,2,1,5,6,4};
        System.out.println(arr.length);//9-4=5
        int k = 2;
        int n=findKthLargest(arr,k);
        System.out.println(n);
        System.out.println(Arrays.toString(arr));

    }static  public int findKthLargest(int[] nums, int k) {
        quicksort(nums,0,nums.length-1);
        int n=nums.length-k;
        System.out.println("n value"+n);
        return nums[n];


    }
    static void quicksort(int arr[],int lo,int hi)
    {
        if(hi<=lo)
        {
            return;
        }
        int s=lo;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }
        quicksort(arr,lo,e);
        quicksort(arr,s,hi);
    }
}
