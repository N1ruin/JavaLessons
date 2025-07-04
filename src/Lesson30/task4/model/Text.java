package Lesson30.task4.model;

public class Text {
    private final String text;
    private TextElement[] paragraphs;

    public Text(String text) {
        this.text = text;
    }

    public TextElement[] getTextElements() {
        return paragraphs;
    }

    public String getText() {
        return text;
    }

    public void setTextElements(TextElement[] textElements) {
        this.paragraphs = textElements;
    }
}
