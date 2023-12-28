import java.util.ArrayList;
import java.util.Scanner;

public class Baek1009 {
    public static void main(String[] args) {
        Baek1009 man=new Baek1009();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            ArrayList<Integer> index = new ArrayList<>();
            index = man.make(a,b);

            int search_index=0;
            for(int j=1; j<=b;){
                for(int z=0;z<4;z++){//gz 0 1 2
                    if(j==b){
                        search_index=z; //j==b이면
                        //System.out.println("확인할거"+search_index);
                    }
                    j++;
                }
            }
            if(index.get(search_index)==0){
                System.out.println(10);
            }else{
                System.out.println(index.get(search_index));
            }
        }
//
    }
    public ArrayList<Integer> make(int a, int b){
        ArrayList<Integer> test = new ArrayList<>();
        int y=a;
        y=make_one(y);
        test.add(y);
        for(int i=1;i<4;i++){
            y*=a;
            //System.out.print("? :"+ y);
            y=make_one(y);
            //System.out.print("만든거:"+ y);
            test.add(y);
        }
        //System.out.println(test);
        return test;
    }
    /*1의 자리를 구하기 위한 과정*/
    public int make_one(int num){
        num %= 10;
        return num;
    }
}