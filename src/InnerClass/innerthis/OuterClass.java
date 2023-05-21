package InnerClass.innerthis;

public class OuterClass {
    private int i=10;
    public class innerClass{
        private int i=100;
        public void show(){
            System.out.println("this.i = " + this.i);
            System.out.println("OuterClass.this.i = " + OuterClass.this.i);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();

        innerClass innerClass = outerClass.new innerClass();
        innerClass.show();
    }
}
