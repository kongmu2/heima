package polymorphic.package1;

public class CarFactory {
    public Car makeCar(String name){
        if (name.equals("Bmw")){
            return new Bmw();
        }else if (name.equals("Bench")){
            return new Bench();
        }else {
            return null;
        }
    }
}
