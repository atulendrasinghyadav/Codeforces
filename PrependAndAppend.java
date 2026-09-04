import java.util.*;
public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) { 

            int n = sc.nextInt();
            String st = sc.next();

            int left = 0;
            int right = n - 1;
            int ans = n;

            while (left < right) { 

                if (st.charAt(left) == st.charAt(right)) {
                    break;
                }

                ans -= 2;
                left++;
                right--;
            }

            System.out.println(ans);

            t--;
        }
    }
}
