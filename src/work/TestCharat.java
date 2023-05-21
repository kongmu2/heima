package work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCharat {
    public static void main(String[] args) {
        String s="Hello World 123abc567sasadsa";

        int letter=0;
        int upper=0;
        int lower=0;
        int digit=0;
        int white=0;
        for (int i = 0; i < s.length(); i++) {
            if ( Character.isLetter(s.charAt(i))){
                letter++;
            }
            if ( Character.isUpperCase(s.charAt(i))){
                upper++;
            }
            if ( Character.isLowerCase(s.charAt(i))){
                lower++;
            }if ( Character.isDigit(s.charAt(i))){
                digit++;
            }
            if ( Character.isWhitespace(s.charAt(i))){
                white++;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("digit = " + digit);
        System.out.println("white = " + white);

    }
}
