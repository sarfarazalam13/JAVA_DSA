import java.util.Arrays;

public class firstandlast {

    static int [] explorer(int nums[],int target)
    {
        int ans[]={-1,-1};
        ans[0]=find(nums,target,true);
        if (ans[0]!=-1)
        {
            ans[1]=find(nums,target,false);
        }
        return ans;
    }

    static int find(int nums[],int target,boolean st)
    {
        int ans=-1;
        int i=0;
        int j= nums.length-1;
        while(i<=j)
        {
           int mid=i+(j-i)/2;
            if(nums[mid]<target)
            {
                i=mid+1;
            }
            else if(nums[mid]>target)
            {
                j=mid-1;
            }
            else {
                ans=mid;
                if(st)
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
     int arr[]={0,1,2,3,3,3,3,5,7};
        System.out.println(Arrays.toString(explorer(arr,3)));


    }
}
