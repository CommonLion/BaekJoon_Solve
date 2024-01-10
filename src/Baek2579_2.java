import java.util.ArrayList;
import java.util.Scanner;

public class Baek2579_2 {
    static ArrayList<Integer> sumArr = new ArrayList<>();
    static int n;
    public static void main(String[] args) {
        Baek2579_2 man = new Baek2579_2();
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] stair = new int[n];
        int[] dp = new int[n];
        int sum = 0, cnt = 0, x1 = 0;
        for (int i = 0; i < n; i++) {
            stair[i] = s.nextInt();
        }
        dp[0] = stair[0];
        dp[1] = Math.max(stair[0]+stair[1], stair[1]);
        dp[2] = Math.max(stair[0]+stair[2], stair[1]+stair[2]);
        for(int i=3;i<n;i++){
            dp[i] = Math.max(dp[i-3]+stair[i-1]+stair[i], dp[i-2]+stair[i]);
        }
        System.out.println(dp[n-1]);
    }
}
