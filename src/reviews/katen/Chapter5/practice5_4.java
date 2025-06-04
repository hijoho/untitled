package reviews.katen.Chapter5;

public class practice5_4 {
    public static void main(String[] args) {
        double bottom=10.0; double height=5.0;
        double radius=5.0;
        double area=calcTriangleArea(bottom, height);
        System.out.println("三角形の面積は"+area+"平方cm");
        area=calcCircleArea(radius);
        System.out.println("円の面積は"+area+"平方cm");
    }

    public static double calcTriangleArea(double bottom, double height){
        return bottom*height/2;
    }

    public static double calcCircleArea(double radius){
        return radius*radius*3.14;
    }
}
