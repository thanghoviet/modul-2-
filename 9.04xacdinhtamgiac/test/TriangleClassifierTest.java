import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    void getEdge0() {
        String result = TriangleClassifier.GetEdge(2,2,2);
        String expect = "La tam giac deu";
        assertEquals(result, expect);
    }
    @Test
    void getEdge1() {
        String result = TriangleClassifier.GetEdge(2,2,3);
        String expect = "La tam giac can";
        assertEquals(result, expect);
    }
    @Test
    void getEdge2() {
        String result = TriangleClassifier.GetEdge(3,4,5);
        String expect = "La tam giac thuong";
        assertEquals(result, expect);
    }
    @Test
    void getEdge3() {
        String result = TriangleClassifier.GetEdge(8,2,3);
        String expect = "ko phai hinh tam giac";
        assertEquals(result, expect);
    }
    @Test
    void getEdge4() {
        String result = TriangleClassifier.GetEdge(-1,2,1);
        String expect = "ko phai hinh tam giac";
        assertEquals(result, expect);
    }
    @Test
    void getEdge5() {
        String result = TriangleClassifier.GetEdge(0,1,1);
        String expect = "ko phai hinh tam giac";
        assertEquals(result, expect);
    }
}