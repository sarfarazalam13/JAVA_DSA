import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class missing {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(find(arr));
    }
    static List<Integer> find(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;

        while(i<arr.length)
        {
            int correctpos=arr[i]-1;
            if(arr[i]!=arr[correctpos])
            {
                swap(arr,i,correctpos);
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                list.add(i+1);

            }

        }
        return list;
    }
    static void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
}
