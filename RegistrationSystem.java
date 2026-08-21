import java.util.*;
public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n > 0) { 
            String st = sc.nextLine();
            map.put(st,map.getOrDefault(st,0)+1);
            int val = map.get(st);
            if (val == 1) {
                System.out.println("OK");
            }
            else{
                int temp = val - 1;
                System.out.println(st+temp);
            }

            n--;
        }
    }
}
