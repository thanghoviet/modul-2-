public class TriangleClassifier2 {

    public static final String KO_PHAI_HINH_TAM_GIAC = "ko phai hinh tam giac";
    public static final String LA_TAM_GIAC_DEU = "La tam giac deu";
    public static final String LA_TAM_GIAC_CAN = "la tam giac can";
    public static final String LA_TAM_GIAC_THUONG = "la tam giac thuong";
    static int currentEdge1;
    static int currentEdge2;
    static int currentEdge3;

    public static String GetEdge(int edge1, int edge2, int edge3) {
        updateCurrentEdges(edge1, edge2, edge3);
        return (!isValidTriangle())
                ? KO_PHAI_HINH_TAM_GIAC
                : (isEquilateralTriangle())
                ? LA_TAM_GIAC_DEU
                : (isIsoscelesTriangle())
                ? LA_TAM_GIAC_CAN
                : LA_TAM_GIAC_THUONG;
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
