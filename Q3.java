package DsaQuestions;

//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int ans = kthSmallest(arr, 0, 5, 2);
        System.out.println(ans);
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        int changes = 0;
        int assumedMin = Integer.MAX_VALUE;
        while(changes != k && l < r){
            if(assumedMin < arr[l]){
                l = l+1;
            }else{
                assumedMin = arr[l];
                changes++;
            }
        }
        return assumedMin;
    }
}
