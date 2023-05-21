package Abstract.pag2;

public class Testshape {
    public static void main(String[] args) {
        Rect rect = new Rect(4, 5);
        System.out.println(rect.getlenth());
        System.out.println(rect.getarea());

        Circle circle = new Circle(6);
        System.out.println(circle.getlenth());
        System.out.println(circle.getarea());
    }
}
