package method;

public class Vehicle {
    double v;
    double size;
    double a;

    public Vehicle(double v, double size, double a) {
        this.v = v;
        this.size = size;
        this.a = a;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void upspeed(double time){
        this.v=v+a*time;
    }
    public void downspeed(double time){
        this.v=v-a*time;
    }

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(10,20,5);
        System.out.println("初始速度"+vehicle.getV());
        System.out.println("初始体积"+vehicle.getSize());
        System.out.println("初始加速度"+vehicle.getA());
        vehicle.upspeed(10);
        System.out.println("加速10秒后的速度"+vehicle.getV());
        vehicle.downspeed(10);
        System.out.println("减速5秒后的速度"+vehicle.getV());
    }
}
