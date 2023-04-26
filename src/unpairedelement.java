public class unpairedelement {
    public static void main(String[] args) {
        int arr[]={1,2,4,1,2,6,6};
        System.out.println(unique(arr));

    }
    static int unique(int arr[])
    {
        int unique=0;
        for(int i:arr)
        {
            unique^=i;
        }
        return unique;
    }

}
