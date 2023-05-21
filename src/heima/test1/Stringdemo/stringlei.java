package heima.test1.Stringdemo;

public class stringlei {
    public static void main(String[] args) {
        String ad="apple";
        String ac="blue";
        System.out.println(ad.concat(ac));






        StringBuffer str=new StringBuffer(16);
        str.append("王八羔子1");
        str.append("王八羔子2");
        str.append("王八羔子3");
        str.delete(0,5);//左闭右开
        System.out.println(str);
        StringBuffer str1=new StringBuffer("小英俊1");
        str1.append("小英俊2");
        str1.append("小英俊3");
        System.out.println(str1);
        str.append(str1);
        System.out.println(str);
        System.out.println(str1);





        StringBuilder set=new StringBuilder(10);
        set.append("青金石").append("钻石").append("红石");
        set.delete(0,1);
        System.out.println(set);


    }
}
