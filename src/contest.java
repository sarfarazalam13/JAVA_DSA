import java.util.Arrays;

public class contest {
    public static void main(String[] args) {
        int mat[][] = new int[2][2];
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = 0; j < mat[i].length - 1; j++) {
                mat[i][j] = 1;

            }

        }
        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int arr[] = {0,0};
        int count = 0, j;
        for (int i = 0; i < mat.length - 1; i++) {
            count = 0;
            for (j = 0; j < mat[i].length - 1; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > arr[1]) {
                arr[0] = i;
                arr[1] = count;
            }

        }
        return arr;
    }
}

