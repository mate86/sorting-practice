import java.util.List;

/**
 * Created by mate on 2017.07.14..
 */
public class BubbleSort {

    public static boolean isSorted(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((int) list.get(i) > (int) list.get(i + 1)) return false;
        }
        return true;
    }
}
