package Enums.m4;

public enum Color implements A{
    RED{
        @Override
        public String getColor() {
            return "红色";
        }
    },GREEN {
        @Override
        public String getColor() {
            return "绿色";
        }
    },YELLOW {
        @Override
        public String getColor() {
            return "黄色";
        }
    };

    public static void show(){
        System.out.println("Color.RED.getColor() = " + Color.RED.getColor());
        System.out.println("Color.RED.getColor() = " + Color.GREEN.getColor());
        System.out.println("Color.RED.getColor() = " + Color.YELLOW.getColor());
    }

}
