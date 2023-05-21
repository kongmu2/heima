package polymorphic;

public class Dog extends Animal{
    public void eat(Food food){
        if (food instanceof Bone){
            System.out.println("狗吃骨头");
        }else{
            System.out.println("狗不吃其他食物");
        }

    }
}
