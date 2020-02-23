import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice  {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11,1));
        Iterator<Integer> numIter = lst.iterator();
        System.out.println(numIter.hasNext());
        System.out.println(numIter.next());
        while(numIter.hasNext()){
            if(numIter.next()>10){
                System.out.println(numIter.next());
            }
        }
     }
}
