import java.util.*;
public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) { 
            String s = sc.next();
            if (s.contains("++")) {
                ans++;
            }
            else if (s.contains("--")) {
                ans--;
            }
            n--;
        }
        System.out.println(ans);
    }
}
