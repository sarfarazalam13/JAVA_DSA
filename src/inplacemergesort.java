import java.util.Arrays;

class InplaceMergesort {
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        inplacemerge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void inplacemerge(int arr[],int start,int end)
    {
        if(end-start==1)
        {
            return;
        }
        int mid=start+(end-start)/2;
        inplacemerge(arr,start,mid);
        inplacemerge(arr,mid,end);
       merge(arr,start,mid,end);

    }
    static void merge(int arr[],int start,int mid,int end)
    {
        int mix[]=new int[end-start];
        int i=start,j=mid,k=0;

        while(i<mid && j<end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid)
        {
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<end)
        {
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++)
        {
            arr[start+l]=mix[l];
        }

    }

}
