package Lesson16.task2.model;

public class HowAreYourDoingMessage implements Message {
    public static final String HOW_ARE_YOU_RESPONSE = "How are your doing";

    @Override
    public void send() {
        System.out.println(HOW_ARE_YOU_RESPONSE);
    }
}
