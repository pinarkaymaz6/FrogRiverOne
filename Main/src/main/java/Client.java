import java.util.HashMap;
import java.util.Map;

public class Client {


    public int solution(int X, int[] A) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], i);
            }
        }

        for (int i = 1; i < X; i++) {
            if (!map.containsKey(i)) {
                return -1;
            }
        }

        Integer element = map.get(X);
        if (element != null) {
            return element;
        }

        return -1;
    }


}
