public class binarySearch {
    static int bin(int arr[],int key)
    {
        int start=0,end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < key) {

                start=mid+1;
            }

            else if(arr[mid]>key) {

                end=mid-1;
            }
            else{
                    return mid;
                }
            }

            return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

       System.out.println(bin(arr,6));
    }
}
