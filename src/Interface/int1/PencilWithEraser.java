package Interface.int1;

public class PencilWithEraser implements PencilInterface{
    @Override
    public void erase() {
        System.out.println("PencilWithEraser.erase([])方法");
    }

    @Override
    public void write() {
        System.out.println("PencilWithEraser.write([])方法");
    }
}
