public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        System.out.println(kadanes(arr));

    }
    static int kadanes(int arr[])
    {
        int maxSum=Integer.MIN_VALUE,currentSum=0;
        for (int i=0;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
            if(currentSum<0)
            {
                currentSum=0;
            }
        }
        return maxSum;
    }
}
