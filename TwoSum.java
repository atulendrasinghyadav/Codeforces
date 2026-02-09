import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int l = 0;
        int r = n - 1;
        boolean flag = false;
        while (l < r) { 
            if (nums[l] + nums[r] > k) {
                r--;
            }
            else if (nums[l] + nums[r] < k) {
                l++;
            }
            else if(nums[l] + nums[r] == k){
                flag = true;
                break;
            }
        }
        int temp1 = l + 1;
        int temp2 = r + 1;
        if(flag){
            System.out.println(temp1 + " " + temp2);
        }
        else{
            System.out.println("-1");
        }
    }
}
