package Lesson7;

public class Task1 {
    public static void main(String[] args) {
        String one = "fdsfdasfa";
        String two = "adfas";
        String three = "lol";

        System.out.println(concat(one,two,three));
    }

    static String concat(String... strings) {
        String result = "";
        for (String string : strings) {
            result += string;
            result += " ";
        }
        return result;
    }
}
