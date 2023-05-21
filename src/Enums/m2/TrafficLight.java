package Enums.m2;

public class TrafficLight {
    Signal signal=Signal.GREEN;
    public void changeLight(){
        switch (signal){
            case RED:
                signal=Signal.GREEN;
                break;
            case GREEN:
                signal=Signal.YELLOW;
                break;
            case YELLOW:
                signal=Signal.RED;
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeLight();

        System.out.println("trafficLight.signal = " + trafficLight.signal);

    }
}
