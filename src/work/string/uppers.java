package work.string;

import org.junit.Test;

import java.util.Arrays;

public class uppers {
    @Test
    public void test(){
        String str="hello world where are you name";
        String up = up(str);
        System.out.println(up);
    }
    public String up(String str){
        StringBuffer result = new StringBuffer();
        for (String s : str.split(" ")) {
            result.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return result.toString().trim();
    }
}
