import java.util.*;

public class SameDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Long> map = new HashMap<>();
            long result = 0;

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                int key = value - i;

                long count = map.getOrDefault(key, 0L);
                result += count;
                map.put(key, count + 1);
            }

            System.out.println(result);
        }
    }
}