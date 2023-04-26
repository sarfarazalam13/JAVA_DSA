public class Mountainarray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 4, 3, 2};
        System.out.println(solution(arr,2));

    }

    static int solution(int arr[], int key) {
        int peak = peak(arr);
        int first=binarySearch(arr,0,peak-1,key);
        if(key== arr[first])
        return first;
        int second=orderAgnostic(arr,peak,arr.length,key);
        if(key== arr[second])
            return first;
        return -1;




    }

        static int binarySearch ( int arr[], int s, int e, int key)
        {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (arr[m] == key) {
                    return m;
                } else if (arr[m] > key) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            return -1;
        }
        static int orderAgnostic(int arr[], int s, int e, int key)
        {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (arr[m] == key) {
                    return m;
                } else if (arr[m] > key) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
            return -1;

        }

        static int peak (int arr[]){
            int s = 0, e = arr.length - 1;
            while (s < e) {
                int m = s + (e - s) / 2;
                //searching peak elemnt
                if (arr[m] > arr[m + 1]) {
                    e = m;
                } else {
                    s = m + 1;
                }
            }
            return e;
        }
    }
