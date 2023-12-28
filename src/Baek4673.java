import java.util.ArrayList;
import java.util.Vector;

public class  Baek4673 {
    public static void main(String[] args) {
        Baek4673 man = new Baek4673();
        //ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> v = new Vector<Integer>();
        int maan = 10000;
        for(int i=0;i<maan;i++){
            //list.add(i);
            v.add(i, i);
        }
        for(int i=0;i<maan;i++){
            if(man.solution(i)+i>=13000){
                //System.out.println("값"+man.solution(i)+i);
                break;
            }
            if(v.contains(man.solution(i)+i)){
                //System.out.println("i:"+i+"해당사항"+(man.solution(i)+i));
                v.remove(v.indexOf(man.solution(i)+i));
            }
        }
        for (int i : v) {
            System.out.println(i);
        }
    }

    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
}
