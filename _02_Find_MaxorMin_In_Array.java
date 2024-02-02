package DsaQuestions;

import java.util.Arrays;

public class _02_Find_MaxorMin_In_Array {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 6, 9, 100, 20, -100, 11};
        Arrays.sort(arr);
        System.out.println("Mix Element in the array is : " + arr[0]);
        System.out.println("Max Element in the array is : " + arr[arr.length-1]);
    }
}
