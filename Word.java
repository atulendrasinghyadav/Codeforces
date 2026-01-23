import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii > 96) {
                lowercaseCount++;
            }
            else{
                uppercaseCount++;
            }
        }

        String result = new String();

        if (uppercaseCount > lowercaseCount) {
            result = str.toUpperCase();
        }
        else{
            result = str.toLowerCase();
        }

        System.out.println(result);
    }
}
