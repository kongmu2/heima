package Enums.m1;

public class A {
    public static void main(String[] args) {
        Gender gender = Gender.valueOf("MALE");
        Gender gender1 = Gender.valueOf("FEMALE");
        int i=gender.compareTo(gender1);//索引相减
        System.out.println("i = " + i);

        System.out.println("gender.ordinal() = " + gender.ordinal());
        System.out.println("gender1.ordinal() = " + gender1.ordinal());
    }
}
