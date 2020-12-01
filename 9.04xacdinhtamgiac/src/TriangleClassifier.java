public class TriangleClassifier {
    public static String GetEdge(int edge1, int edge2, int edge3) {
        if (!isTriangle(edge1, edge2, edge3))
            return "ko phai hinh tam giac";
        if (isEquilateralTriangle(edge1, edge2, edge3))
            return "La tam giac deu";

        if (isIsoscelesTriangle(edge1, edge2, edge3))
            return "la tam giac can";

        return "la tam giac thuong";

    }

    private static boolean isIsoscelesTriangle(int edge1, int edge2, int edge3) {
        return edge1 == edge2 || edge1 == edge3 || edge2 == edge3;
    }

    private static boolean isEquilateralTriangle(int edge1, int edge2, int edge3) {
        return edge1 == edge2 && edge2 == edge3;
    }

    private static boolean isTriangle(int edge1, int edge2, int edge3) {
        return (edge1 + edge2 - edge3) * (edge1 + edge3 - edge2) * (edge2 + edge3 - edge1) > 0;
    }
}
