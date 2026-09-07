import java.util.*;
public class OneDEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) { 

            int n = sc.nextInt();
            int bSize = sc.nextInt();
            String st = sc.next();

            int left = 0;
            int right = 0;

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (st.charAt(i) == 'B') {
                    left = i;
                    right = left + bSize;
                    count++;
                    i = right-1;
                }
            }

            System.out.println(count);

            t--;
        }
    }
}
