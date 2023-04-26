import java.util.ArrayList;

public class Searchall {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,2};
        findall(arr,0,2);
        System.out.println(list);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static int findall(int[] arr,int index,int key)
    {
        if(index==arr.length)
        {
            return 0;
        }
        else

            if(arr[index]==key)

                list.add(index);
                return findall(arr,index+1,key);



    }
}
