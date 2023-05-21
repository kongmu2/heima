package overload;

public class test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.add(1,3));
        System.out.println(shape.add(1,3,4));
        System.out.println(shape.add(1.2,5.3));
        System.out.println(shape.add(1.1,3.2,4.4));
    }
}
