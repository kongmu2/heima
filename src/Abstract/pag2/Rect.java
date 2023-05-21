package Abstract.pag2;

public class Rect extends MyShape{
    private double height;
    private double width;

    public Rect() {
    }

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getlenth() {

        return width+height;
    }

    @Override
    public double getarea() {

        return width*height;
    }
}
