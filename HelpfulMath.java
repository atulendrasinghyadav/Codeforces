import java.util.*;
public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count1++;
            }
            else if (str.charAt(i) == '2') {
                count2++;
            }
            else if (str.charAt(i) == '3') {
                count3++;
            }
        }

        char[] arr = new char[n];
        for(int i = 0; i < n; i++){
            if (i % 2 != 0) {
                arr[i] = '+';
            }
            else if (count1 > 0) {
                arr[i] = '1';
                count1--;
            }
            else if (count2 > 0) {
                arr[i] = '2';
                count2--;
            }
            else if (count3 > 0) {
                arr[i] = '3';
                count3--;
            }
        }

        String result = new String(arr);

        System.out.println(result);
    }
}
