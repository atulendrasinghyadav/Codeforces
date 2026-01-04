import java.util.*;
public class WayTooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) { 
            String s = sc.next();

            int n = s.length();
            if (n > 10) {
                int m = n - 2;
                int p = n - 1;
                System.out.println("" + s.charAt(0) + m + s.charAt(p));
            }
            else{
                System.out.println(s);
            }

            t--;
        }
        sc.close();
    }
}
