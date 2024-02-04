package DsaQuestions;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        reverse(arr);
        reverse2(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        for (int i = 0; i < (arr.length+1)/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    // Using recursion
    static void reverse2(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse2(arr, start+1, end-1);
    }
}
