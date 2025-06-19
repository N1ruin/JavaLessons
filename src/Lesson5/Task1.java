package Lesson5;

public class Task1 {
    public static void main(String[] args) {
        char[] chars = {'Е', 'в', 'г', 'е', 'н', 'и', 'й'};

        for (char ch : chars) {
            System.out.print(ch);
        }
        System.out.println();
        String name = "";
        for (char ch : chars) {
            name += ch;
        }
        System.out.println(name);
    }
}
