 class floorOfaNUm {
    public static void main(String[] args) {
        int arr[] ={2,3,5,9,13,16,18};
        System.out.println(ceil(arr,4));
    }
    static int ceil(int arr[],int key)
    {
        int s=0,e=arr.length-1,m=0;
        if(key>arr[e])
        {
            return -1;
        }
        while(s<=e)
        {
            m=s+(e-s)/2;
            if(arr[m]==key)
            {
                return arr[m];
            }
            else if (arr[m]>key)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return arr[e];//arr[m-1];
    }
}
