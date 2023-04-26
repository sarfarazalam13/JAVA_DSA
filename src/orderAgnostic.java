public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] are={6,5,4,3,2,1};
        System.out.println(obs(arr,5));
        System.out.println(obs(arr,9));
        System.out.println(obs(are,4));
        System.out.println(obs(are,9));

    }
    static int obs(int arr[],int key) {
        int s = 0, e = arr.length - 1;


        boolean isAscending = arr[s] < arr[e];
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(arr[m]==key)
            {
                return m;
            }
            else if(isAscending)
            {
             if(key<arr[m])
             {
                 e=m-1;
             }
             else {
                 s=m+1;
             }
            }
            else {
                if(key<arr[m])
                {

                    s=m+1;
                }
                else {

                    e=m-1;
                }

            }

        }
        return -1;

    }
}
