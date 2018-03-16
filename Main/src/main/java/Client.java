import java.util.*;

public class Client {


    public int solution(int X, int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!list.contains(A[i]))
                list.add(A[i]);
        }
        Integer element = list.get(list.size() - 1);
        if (list.size() == X) {
            for (int i = 0; i < A.length; i++) {
                if (element == A[i]) {
                    return i;
                }
            }
        }
        return -1;
    }


}
