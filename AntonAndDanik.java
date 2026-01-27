import java.util.*;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.next();

        int countOfA = 0;
        int countOfD = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'A') {
                countOfA++;
            }
            else{
                countOfD++;
            }
        }

        if (countOfA > countOfD) {
            System.out.println("Anton");
        }
        else if (countOfD > countOfA) {
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}