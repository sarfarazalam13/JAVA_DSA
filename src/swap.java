class Soluti{
    public static void main(String[] args) {
        int arr[]={4,7,11};//1,2,3,5,6
        int x=findKthPositive(arr,5);
        System.out.println(x);

    }
    static public int findKthPositive(int[] arr, int k) {
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            if(k<arr[i])
            {
                return k;
            }
            m+=arr[i+1]-arr[i]-1;
            if(m>=k)
            {
                return arr[i]+m;
            }
        }
        return arr.length+k;

    }

}