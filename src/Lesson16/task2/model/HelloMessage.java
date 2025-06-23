package Lesson16.task2.model;

public class HelloMessage implements Message {
    public static final  String HELLO_RESPONSE = "Hello";

    @Override
    public void send() {
        System.out.println(HELLO_RESPONSE);
    }
}
