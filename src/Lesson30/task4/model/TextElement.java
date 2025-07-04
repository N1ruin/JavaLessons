package Lesson30.task4.model;

public class TextElement {
    private String value;
    private TextElement[] childrenElements;

    public TextElement(String value, TextElement[] childrenElements) {
        this.value = value;
        this.childrenElements = childrenElements;
    }

    public String getValue() {
        return value;
    }

    public TextElement[] getChildrenElements() {
        return childrenElements;
    }

    public void setChildrenElements(TextElement[] childrenElements) {
        this.childrenElements = childrenElements;
    }
}
