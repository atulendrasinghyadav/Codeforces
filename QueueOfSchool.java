import java.util.Scanner;
public class QueueOfSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        String temp = sc.next();
        
        char queue[] = temp.toCharArray();

        while (t > 0) { 

            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i+1] == 'G') {
                    char temp1 = queue[i];
                    queue[i] = queue[i+1];
                    queue[i+1] = temp1;
                    i++;
                }
            }

            t--;
        }

        String result = new String(queue);

        System.out.println(result);
    }
}