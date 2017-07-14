import java.util.List;

/**
 * Created by mate on 2017.07.14..
 */
public class Main {

    public static void main(String[] args) {
        List unsortedList = CreateRandomList.unsorted(100);
        List sortedList = CreateRandomList.sorted(100);
        System.out.println(BubbleSort.isSorted(unsortedList));
    }
}
