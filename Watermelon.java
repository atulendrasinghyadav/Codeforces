import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2){
            System.out.print("NO");
        }
        else if (n % 2 == 0) {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        sc.close();
    }
}
