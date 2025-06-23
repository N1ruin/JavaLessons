package Lesson16.task2.model;

public class GoodByeMessage implements Message {
    public static final String GOOD_BYE_RESPONSE = "Good bye";

    @Override
    public void send() {
        System.out.println(GOOD_BYE_RESPONSE);
    }
}
