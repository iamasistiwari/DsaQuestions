package DsaQuestions;

import java.sql.Array;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int a[]){
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    int temp0 = a[low];
                    a[low] = a[mid];
                    a[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    int temp2 = a[high];
                    a[high] = a[mid];
                    a[mid] = temp2;
                    high--;
                    break;
            }
        }
    }
}
