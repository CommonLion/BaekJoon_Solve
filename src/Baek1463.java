import java.io.*;
import java.util.*;
import java.lang.Math;

//탑다운 방식, 시간초과남.
public class Baek1463 {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        dp=new int[n+1];

        System.out.println(repeat(n));

    }
    public static int repeat(int x){
        /*1까지 도달하면 0을 반환*/
        if(x==1)return 0;

        /*이미 값이 존재하면 그것 반환, 최소값처리는 이미 진행한 상태임*/
        if (dp[x] != 0) return dp[x];

        /*-1을 하는 케이스는 항상 존재하니까 먼저 해줌.*/
        dp[x] = repeat(x-1) +1;

        /*3으로 나뉘는 케이스*/
        if(x%3==0){
            dp[x] = Math.min(repeat(x/3)+1, dp[x]);
        }
        /*2로 나뉘는 케이스*/
        if(x%2==0){
            dp[x] = Math.min(repeat(x/2)+1, dp[x]);
        }

        return dp[x];
    }
}
