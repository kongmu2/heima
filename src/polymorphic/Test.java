package polymorphic;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
        Bone bone = new Bone();
        Fish fish = new Fish();
        Bnanna bnanna = new Bnanna();

        women women = new women();
        women.feed(dog,bone);
        women.feed(dog,fish);
        women.feed(cat,fish);
        women.feed(cat,bone);
        women.feed(monkey,bnanna);
        women.feed(monkey,fish);

    }
}
