public class TriangleClassifier2 {

    static int currentEdge1;
    static int currentEdge2;
    static int currentEdge3;

    public static String GetEdge(int edge1, int edge2, int edge3) {
        updateCurrentEdges(edge1, edge2, edge3);
        return (!isValidTriangle())
                ? "ko phai hinh tam giac"
                : (isEquilateralTriangle())
                ? "La tam giac deu"
                : (isIsoscelesTriangle())
                ? "la tam giac can"
                : "la tam giac thuong";
    }

    private static void updateCurrentEdges(int edge1, int edge2, int edge3) {
        currentEdge1 = edge1;
        currentEdge2 = edge2;
        currentEdge3 = edge3;
    }

    private static boolean isIsoscelesTriangle() {
        return currentEdge1 == currentEdge2
                || currentEdge1 == currentEdge3
                || currentEdge2 == currentEdge3;
    }

    private static boolean isEquilateralTriangle() {
        return currentEdge1 == currentEdge2
                && currentEdge2 == currentEdge3;
    }

    private static boolean isValidTriangle() {
        return (currentEdge1 + currentEdge2 - currentEdge3)
                * (currentEdge1 + currentEdge3 - currentEdge2)
                * (currentEdge2 + currentEdge3 - currentEdge1)
                > 0;

    }
}
