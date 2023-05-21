package work.string;

import org.junit.Test;

public class test {
    
    @Test
    public void test(){
        String s="dksajkdwj231231dhkjawsd12344asdawdawjk1231adsakadjkwj231kwjdakwjk";
        String[] res=s.split("\\d+");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        
    }
    @Test
    public void testCompareto(){
        String a="Hello";
        String b="world";
        System.out.println(a.compareTo(b));

    }

    @Test
    public void testRegs(){
        String phone="19931864430";
        String email="231dsadawd@qq.com";
        boolean matches1 = phone.matches("1[3579]\\d{9}");
        boolean matches2 = phone.matches("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$");

        boolean matches3 = email.matches("\\w+@\\w+(\\.\\w+){1,2}");
        System.out.println(matches1);
        System.out.println(matches2);
        System.out.println(matches3);
    }
}
