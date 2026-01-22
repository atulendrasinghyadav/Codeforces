import java.util.Scanner;

public class SoldierAndBananas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = 0;

        for (int i = 1; i <= w; i++) {
            totalCost += i*k;
        }

        if (totalCost > n) {
            int result = totalCost - n;
            System.out.println(result);
        }
        else{
            System.out.println(0);
        }
    }
}