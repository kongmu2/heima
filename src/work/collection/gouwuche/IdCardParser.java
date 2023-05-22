package work.collection.gouwuche;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IdCardParser {
    public static LocalDate getBirthDate(String idCardNumber) {
        if (idCardNumber == null || idCardNumber.length() != 18) {
            throw new IllegalArgumentException("身份证号码格式不正确：" + idCardNumber);
        }

        int year = Integer.parseInt(idCardNumber.substring(6, 10));
        int month = Integer.parseInt(idCardNumber.substring(10, 12));
        int day = Integer.parseInt(idCardNumber.substring(12, 14));
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        String idCardNumber = "43052119900101001X";
        LocalDate birthDate = getBirthDate(idCardNumber);
        String formattedBirthDate = birthDate.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(String.format("身份证号码为%s的人出生于%s", idCardNumber, formattedBirthDate));
    }
}