package Lesson1;

public class Task1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //с третьей переменной
//        int c = a;
//        a = b;
//        b = c;

        // без третьей переменной
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
