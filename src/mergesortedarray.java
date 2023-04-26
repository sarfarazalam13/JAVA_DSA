public class mergesortedarray {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,4,6};
    }
    static void sort(int arr1[],int arr2[])
    {
        int i=0,j=0,k=arr1.length;
        for(i=0;i<arr1.length;i++)
        {
         if(arr1[i]>arr2[j])
         {
             int temp=arr1[k];
             arr1[k]=arr2[j];
             k--;//swap
         }
         else {
             j++;
         }
        }

    }
}
