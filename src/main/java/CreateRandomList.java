import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mate on 2017.07.14..
 */
public class CreateRandomList {

    public static List unsorted(int n) {
        List newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(new Random().nextInt(99) + 1);
        }
        return newList;
    }

    public static List sorted(int n) {
        List newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(i + 1);
        }
        return newList;
    }
}
