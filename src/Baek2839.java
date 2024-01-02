import java.util.Scanner;

public class Baek2839 {
    //그리디 알고리즘임. 5를 먼저 다 빼다라 3의 배수인 것 만 남을때 3을 빼는 거임.
    //이론상 3은 4개 이상이 나올수 없으며
    //5의 감소 필터는 5나머지가 생긴다면 or 3나머지가 0이 아니라면으로 작용한다.
    //12는 3이 4개  => 3이 5개가 되는 경우는 존재하지 않는 거지..
    //11=> 5 3 3
    //3 6 9 12
    //5 10 15
    //18 -5 -5 -5 -3
    //24 -5 -5 -5 3 3
    // 0보다 작거나 같으면 멈춤.

    public static void main(String[] args) {
        Baek2839 man = new Baek2839();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int sum = 0;
        int result = man.sub5(x, sum);
        System.out.println(result);

    }

    public int sub5(int a, int sum) {
        int num = a;
        while (num >= 15 || num % 3 != 0 || num % 5 == 0) {//num>=15 이거 자워도 돨거 같은데..
            num -= 5;
            if (num == 0) {
                return sum + 1;
            } else if (num < 0) {
                //System.out.println("Error");
                sum = -1;
                return sum;
            }
            //System.out.print(num+"->");
            sum++;

        }

        sum = sub3(num, sum);
        return sum;

    }

    public int sub3(int a, int sum) {
        int num = a;
        while (num >= 0) {
            num -= 3;
            if (num == 0) {
                return sum + 1;
            }
            if (num < 0) {
                sum = -1;
                return sum;
            }
            //System.out.print("(3)"+num+"->");
            sum++;
        }

        return sum;
    }


}
