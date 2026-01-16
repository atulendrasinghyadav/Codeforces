import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Set<Character> charSet = new HashSet<>();

        for (char temp : str.toCharArray()) {
            charSet.add(temp);
        }

        if (charSet.size() % 2 != 0) {
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
}
