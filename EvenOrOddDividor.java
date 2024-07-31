import java.util.ArrayList;
import java.util.List;

public class EvenOrOddDividor implements Runnable{

    List<Integer> list;

    static ArrayList<Integer> evenList = new ArrayList<>();
    static ArrayList<Integer> oddList = new ArrayList<>();

    public EvenOrOddDividor(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //synchronized
        for(int i=0; i < list.size(); i++){
            int curr = list.get(i);
            if(isEven(curr)){
                evenList.add(curr);
            } else {
                oddList.add(curr);
            }
        }
        
    }

    public boolean isEven(int num){
        return num % 2 == 0;
    }

}
