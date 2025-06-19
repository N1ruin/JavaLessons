package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        String name = "Евгений";
        char e = 'e', v = 'v', g = 'g', n = 'n', i = 'i', y = 'y', E = 'E';

        //вывод через string
        System.out.println(name);
        //вывод через несколько char
        System.out.print(E);
        System.out.print(v);
        System.out.print(g);
        System.out.print(e);
        System.out.print(n);
        System.out.print(i);
        System.out.println(y);

        //вывод через один char
        char ch = E;
        System.out.print(ch);
        ch = v;
        System.out.print(ch);
        ch = g;
        System.out.print(ch);
        ch = e;
        System.out.print(ch);
        ch = n;
        System.out.print(ch);
        ch = i;
        System.out.print(ch);
        ch = y;
        System.out.println(ch);

        //усложнение для внимательных
        System.out.print(E);
        System.out.print('\n');
        System.out.print(v);
        System.out.print('\n');
        System.out.print(g);
        System.out.print('\n');
        System.out.print(e);
        System.out.print('\n');
        System.out.print(n);
        System.out.print('\n');
        System.out.print(i);
        System.out.print('\n');
        System.out.print(y);
        System.out.print('\n');
        // string
        System.out.println();
        System.out.print("E" + '\n' + 'v' + '\n' + 'g' + '\n' + 'e' + '\n' + 'n' + '\n' + 'i' + '\n' + 'y');
    }
}
