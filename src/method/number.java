package method;

public class number {
    int a;
    int b;

    public number(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addition(){
        return this.a+this.b;
    }
    public int subtration(){
        return this.a-this.b;
    }
    public int multiplication(){
        return this.a*this.b;
    }
    public int division(){
        return this.a/this.b;
    }
    public static void main(String[] args) {
        number n1=new number(9,3);
        System.out.println(n1.addition());
        System.out.println(n1.multiplication());
        System.out.println(n1.subtration());
        System.out.println(n1.division());
    }
}
