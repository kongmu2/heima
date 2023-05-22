package work.collection.gouwuche;

public class Count {
    public static int countSubstrings(String text, String target) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(target, index)) >= 0) {
            count++;
            index += target.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "javasdfjavawerjavavsswetjavadfgdfgjavadfgdfbtujava";
        String target = "java";
        int count = countSubstrings(text, target);
        System.out.println(String.format("在字符串%s中，子串%s共出现了%d次", text, target, count));
    }
}