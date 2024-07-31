import java.util.ArrayList;
import java.util.List;

/**
 * main
 */

public class main {    

    public static void main(String[] args) {
        ArrayList<Integer> listProcessed = new ArrayList<Integer>();

        for(int i = 1; i <= 10000; i++ ){
            listProcessed.add(i);
        }

        List<Integer> list1 =  listProcessed.subList(0,2500);
        List<Integer> list2 = listProcessed.subList(2501,5000);
        List<Integer> list3 = listProcessed.subList(5001,7500);
        List<Integer> list4 = listProcessed.subList(7501,10000);

        EvenOrOddDividor dividor1 = new EvenOrOddDividor(list1);
        EvenOrOddDividor dividor2 = new EvenOrOddDividor(list2);
        EvenOrOddDividor dividor3 = new EvenOrOddDividor(list3);
        EvenOrOddDividor dividor4 = new EvenOrOddDividor(list4);

        dividor1.run();
        dividor2.run();
        dividor3.run();
        dividor4.run();


        System.out.println(EvenOrOddDividor.evenList.toString());
        System.out.println(EvenOrOddDividor.oddList.toString());

    }
    //synchronizing?
}