import java.util.ArrayList;
public class returnArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,2,5};
        ArrayList<Integer> list=find(arr,0,new ArrayList<>(),2);
        System.out.println(list);

    }
    static ArrayList<Integer> find(int[] arr,int index,ArrayList<Integer> list,int key)
    {
        if(index==arr.length)
        {
            return list;
        }
        else {
            if(arr[index]==key)
            {
                list.add(index);
            }
            return find(arr,index+1,list,key);
        }
    }
}
