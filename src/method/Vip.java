package method;

public class Vip {
    String name;
    String cardNo;
    String phone;
    int score;
    double money;

    public Vip() {
    }

    public Vip(String name, String cardNo, String phone, int score, double money) {
        this.name = name;
        this.cardNo = cardNo;
        this.phone = phone;
        this.score = score;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void consume(double money){
        double m=0;
        if(money>2000){
            m=money*0.5;
        }else if(money>1000){
            m=money*0.8;
        }else {
            m=money;
        }
        if(m>this.money){
            System.out.println("余额不足");
        }else {
            this.money-=m;
            System.out.println("");
        }
    }
    void charge(double money){
        if(money<=0){
            System.out.println("请充值");
        }else {
            this.money+=money;
        }
    }

    public static void main(String[] args) {
        Vip vip=new Vip("张三","661661656","656665",155555,0);
        System.out.println(vip.getName());

    }
}
