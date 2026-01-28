import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String str2 = sc.next();

        StringBuilder revStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }

        String str3 = revStr.toString();

        if (str2.equals(str3)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
