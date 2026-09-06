import java.util.*;
public class Prefiquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) { 

            int n = sc.nextInt();
            int m = sc.nextInt();

            String st1 = sc.next();
            String st2 = sc.next();

            int i = 0;
            int j = 0;

            while (j < m && i < n) { 
                if (st1.charAt(i) == st2.charAt(j)) {
                    i++;
                }
                j++;
            }

            System.out.println(i);

            t--;
        }
    }
}
