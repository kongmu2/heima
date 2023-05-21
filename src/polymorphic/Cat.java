package polymorphic;

public class Cat extends Animal{
    public void eat(Food food){
        if (food instanceof Fish){
            System.out.println("猫吃鱼");
        }else{
            System.out.println("猫不吃其他食物");
        }
    }
}
