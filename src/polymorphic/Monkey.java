package polymorphic;

public class Monkey extends Animal{
    public void eat(Food food){
        if (food instanceof Bnanna){
            System.out.println("猴子吃香蕉");
        }else{
            System.out.println("猴子不吃其他食物");
        }
    }
}
