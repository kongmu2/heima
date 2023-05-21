package Abstract.pag2;

public class Circle extends MyShape{
    private double R;
    private static final double pai=Math.PI;


    public Circle() {
    }

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public double getlenth() {

        return 2*pai*R;
    }

    @Override
    public double getarea() {

        return pai*R*R;
    }
}
