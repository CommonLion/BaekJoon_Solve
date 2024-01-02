import java.util.Scanner;

//에라토스테네스의 체를 이용하여, 소수추출해서 배열에 넣고
//해당 수 가 약수를 가지고 있다면 대칭의 형태를 가진 곱이 있으므로,
//체를 한번만 만들고 사용이 더 효율적인가?


//메모리 초과,,,, 날거 같긴 했음

public class Baek4134_2 {
    public static void main(String[] args) {
        Baek4134_2 man = new Baek4134_2();
//
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long t;
        for (long i = 0; i < n; i++) {
            t=s.nextInt();
            if(t==0){
                System.out.println(2);
            } else if (t==1) {
                System.out.println(2);
            }else{
                man.test_t(t);
            }
        }
    }

    public Boolean isPrime(long n) {
        for (long i = 2; i<= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {

                return true;
            }
        }
        return false;
    }

    public void test_t(long n){
        long num = n;
        while(true){
           if(!isPrime(num)){
               System.out.println(num);
               break;
           }
           num++;
        }
    }
}
