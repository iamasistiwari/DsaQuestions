package DsaQuestions;
import java.util.Arrays;

//https://www.geeksforgeeks.org/program-to-reverse-an-array/
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 6, 9, 100, 20, -100, 11};
        Arrays.sort(arr);
        System.out.println("Mix Element in the array is : " + arr[0]);
        System.out.println("Max Element in the array is : " + arr[arr.length-1]);
    }
}
