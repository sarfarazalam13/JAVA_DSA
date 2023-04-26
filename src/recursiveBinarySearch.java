
/*public classrecursiveBinarySearch {
    public static void main(String[] args) {

    }
    static int binsrch(int arr[],int start,int end,int key)
    {
        if(start>=end)
        {
            return -1;
        }
        else {
            int mid=start+(end-start)/2;
            if (arr[mid]==key) {
                return mid;
            }
            if(arr[start]<arr[mid]) {
                if (key > arr[start] && key < arr[mid]) {
                    return binsrch(arr, start, end, key);
                } else {
                    return binsrch(arr, mid + 1, end, key);

                }

            if(arr[start]>arr[mid])
            {return binsrch(arr, mid + 1, end, key);
            }




        }
    }
}*/
