import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Baek2309{
    public static void main(String[] args) {
        ArrayList<Integer> ori_list = new ArrayList<>();
        ArrayList<Integer> list;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            ori_list.add(s.nextInt());
        }
        list = new ArrayList<>(ori_list);
        int sum=0;

        for (int i = 0; i < 9; i++) {
            for(int j=i+1; j < 9; j++){
                sum=0;
                list.remove(i);
                list.remove(j-1);
                for(int a:list){
                    sum+=a;
                }
                if(sum==100){
                    Collections.sort(list);
                    for(int a : list){
                        System.out.println(a);
                    }
                    return;
                }
                list = new ArrayList<>(ori_list);
            }

        }
    }
}












