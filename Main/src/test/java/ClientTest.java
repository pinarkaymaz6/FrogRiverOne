import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


class ClientTest {
    @Test
    void solution() {
        int X=5;
        int[] A ={1,3,1,4,2,3,5,4};
        Client client = new Client();
        assertEquals(6, client.solution(X, A));
    }
    @Test
    void testNoSolution() {
        int X=2;
        int[] A ={2,2,2,2,2};
        Client client = new Client();
        assertEquals(-1, client.solution(X, A));
    }
    @Test
    void testOneElementArray() {
        int X=1;
        int[] A ={1};
        Client client = new Client();
        assertEquals(0, client.solution(X, A));
    }
    @Test
    void testLargeRange() {
        int X=30000;
        int[] A = IntStream.rangeClosed(1, X).toArray();
        Client client = new Client();
        assertEquals(X - 1, client.solution(X, A));
    }
}