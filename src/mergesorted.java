import java.util.Arrays;

class mergesortde {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    //last index pe gaye dono ke oor K jo nums 1 (bade array) ka last index hai us ko jo bhi dono me se bada value hua use de die
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
    }
}