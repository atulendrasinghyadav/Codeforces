import java.util.*;

public class BeautifulYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (;;) {
            n++;
            String year = Integer.toString(n);
            if (year.charAt(0) != year.charAt(1) && year.charAt(0) != year.charAt(2) && year.charAt(0) != year.charAt(3) &&
                year.charAt(1) != year.charAt(2) && year.charAt(1) != year.charAt(3) &&
                year.charAt(2) != year.charAt(3)) {
                System.out.println(year);
                break;
            }
        }
    }
}
