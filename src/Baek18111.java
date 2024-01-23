import java.io.*;
import java.util.StringTokenizer;

public class Baek18111 {
    public static void main(String[] args) throws IOException {
        Baek18111 man = new Baek18111();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer sb = new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());
        int b =  Integer.parseInt(sb.nextToken());
        int [][]arr = new int[n][m];
        int inven;

        int min = 256;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sb = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(sb.nextToken());
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        int key = 0;
        int time_bound = 1000000000;
        int high_bound = 0;
        int cnt =0;

        Loop1 :
        for (int z = min; z <= max; z++) { //y축
            inven = b;
            key=0;
            Loop2 :
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i][j]>z){ //내려가는 경우
                        inven += arr[i][j]-z;
                        key += (arr[i][j]-z)*2;
                    }else if(arr[i][j]<z){//올라가는 경우wj
                        inven -= z-arr[i][j];
                        key += z-arr[i][j];
                    }
                }
            }
            if(inven<0){
                continue Loop1;
            }
            if(key<=time_bound && high_bound<=z){ //높이에 대한 조건 확인은 중복때문에
                time_bound=key;
                high_bound=z;
            }

            System.out.println(inven+"||"+key+"++"+z+"||"+cnt);
        }
        bw.write(time_bound+" "+high_bound);
        bw.flush();
        bw.close();
    }
}
