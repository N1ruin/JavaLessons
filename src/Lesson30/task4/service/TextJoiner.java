package Lesson30.task4.service;

import Lesson30.task4.model.Text;
import Lesson30.task4.model.TextElement;

public class TextJoiner {

    public String joinText(Text text) {
        StringBuilder sourceText = new StringBuilder();

        TextElement[] paragraphs = text.getTextElements();
        joinParagraphs(sourceText, paragraphs);

        return sourceText.toString().replaceAll(" \\.", ". ");
    }

    private void joinParagraphs(StringBuilder sourceText, TextElement[] paragraphs) {
        sourceText.append("\t");

        for (TextElement paragraph : paragraphs) {
            TextElement[] sentences = paragraph.getChildrenElements();
            joinSentences(sourceText, sentences);
            sourceText.append("\n").append("\t");
        }
    }

    private void joinSentences(StringBuilder sourceText, TextElement[] sentences) {
        for (TextElement sentence : sentences) {
            TextElement[] words = sentence.getChildrenElements();
            joinWords(sourceText, words);
        }
    }

    private void joinWords(StringBuilder sourceText, TextElement[] words) {
        for (TextElement word : words) {
            sourceText.append(word.getValue()).append(" ");
        }
        sourceText.append(".");
    }
}