public class MooresVotingAlgorithm {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    static int majority(int[] nums)
    {
        int ans=nums[0];
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(ans==nums[i])
            {
                count++;
            }
            else {
                count--;
            }
            if(count==0)
            {
                ans=nums[i];
                count=1;
            }
        }
        return ans;
    }
}
