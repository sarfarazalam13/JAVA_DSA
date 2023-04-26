public class consecutiveones {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maxy(arr,k));
    }
    static int maxy(int arr[],int k)
    {
        int ans=0;
        for (int l=0,r=0;r<arr.length;r++)
        {
            if(arr[r]==0)
            {
                k--;
            }
            while(k<0)
            {
                if(arr[l]==0)
            {
                k++;
            }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
