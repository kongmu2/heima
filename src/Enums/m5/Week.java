package Enums.m5;

public enum Week {
    MON("周一"),
    TUE("周二"),
    WED("周三"),
    THU("周四"),
    FRI("周五"),
    SAT("周六"),
    SUN("周日"),
    ;

    Week(String day) {
        this.day = day;
    }

    Week() {
    }

    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void show(int i){
        switch (i){
            case 1:
                System.out.println("Week.MON = " + Week.MON);
                break;
            case 2:
                System.out.println("Week.MON = " + Week.TUE);
                break;
            case 3:
                System.out.println("Week.MON = " + Week.WED);
                break;
            case 4:
                System.out.println("Week.MON = " + Week.THU);
                break;
            case 5:
                System.out.println("Week.MON = " + Week.FRI);
                break;
            case 6:
                System.out.println("Week.MON = " + Week.SAT);
                break;
            case 7:
                System.out.println("Week.MON = " + Week.SUN);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value+" = " + value.getDay());
        }
    }
}
