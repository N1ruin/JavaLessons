package Lesson17.task1;

public enum Message {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW_ARE_YOU("How are you", "How are your doing"),
    UNKNOWN(null, "Unknown message");
    private final String message;
    private final String response;

    Message(String message, String response) {
        this.message = message;
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public String getMessage() {
        return message;
    }

    public static Message findResponse(String message) {
        if (message == null) {
            return UNKNOWN;
        }

        for (Message messagei : Message.values()) {
            if (message.equals(messagei.message)) {
                return messagei;
            }
        }

        return UNKNOWN;
    }
}
