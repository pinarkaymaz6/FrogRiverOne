import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @org.junit.jupiter.api.Test
    void solution() {
        int X=5;
        int[] A ={1,3,1,4,2,3,5,4};
        Client client = new Client();
        assertEquals(6, client.solution(X, A));
    }
    @org.junit.jupiter.api.Test
    void testNoSolution() {
        int X=2;
        int[] A ={2,2,2,2,2};
        Client client = new Client();
        assertEquals(-1, client.solution(X, A));
    }
    @org.junit.jupiter.api.Test
    void testOneElementArray() {
        int X=1;
        int[] A ={1};
        Client client = new Client();
        assertEquals(0, client.solution(X, A));
    }

}