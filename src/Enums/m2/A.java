package Enums.m2;

public class A {
    public static void main(String[] args) {
        Signal[] values=Signal.values();
        for (Signal value : values) {
            System.out.println("value = " + value);
        }
    }
}
