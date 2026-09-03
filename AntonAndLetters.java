import java.util.*;

public class AntonAndLetters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.substring(1, input.length()-1);
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (String letter : input.split(", ")) {
            set.add(letter.charAt(0));
        }
        System.out.println(set.size());
    }
}