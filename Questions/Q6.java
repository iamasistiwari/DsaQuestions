package DsaQuestions.Questions;
import java.util.HashSet;


//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

//Hashset only takes distinct values.
public class Q6 {
    public static void main(String[] args) {
        int[] a = {6, 2};
        int[] b = {85, 25, 1, 32, 54, 6};
        int ans = doUnion(a, a.length, b, b.length);
        System.out.println(ans);
    }
    public static int doUnion(int a[], int n, int b[], int m){
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i<n; i++){
            map.add(a[i]);
        }
        for(int i = 0; i<m; i++){
            map.add(b[i]);
        }
        return map.size();
    }
}
