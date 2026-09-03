import java.util.*;

public class Horseshoe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int elem : arr) {
            set.add(elem);
        }
        int result = 4 - set.size();
        System.out.println(result);
    }
}