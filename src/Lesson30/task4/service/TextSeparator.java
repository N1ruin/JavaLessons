package Lesson30.task4.service;

import Lesson30.task4.model.Text;
import Lesson30.task4.model.TextElement;

public class TextSeparator {

    public void separateText(Text text) {
        separateTextToParagraphs(text);
        separateTextParagraphsToSentences(text);
        separateTextSentencesToWords(text);
    }

    private void separateTextToParagraphs(Text text) {
        String[] textParagraphs = text.getText().split("\n");
        TextElement[] textElements = transferStringArrayToTextElementArray(textParagraphs);
        text.setTextElements(textElements);
    }

    private TextElement[] transferStringArrayToTextElementArray(String[] transferStrings) {
        TextElement[] textElements = new TextElement[transferStrings.length];
        for (int i = 0; i < textElements.length; i++) {
            textElements[i] = new TextElement(transferStrings[i], null);
        }
        return textElements;
    }

    private void separateTextParagraphsToSentences(Text text) {
        TextElement[] paragraphs = text.getTextElements();

        for (TextElement paragraph : paragraphs) {
            String[] paragraphSentences = paragraph.getValue().split("[!.?] ");
            TextElement[] sentences = transferStringArrayToTextElementArray(paragraphSentences);
            paragraph.setChildrenElements(sentences);
        }
    }

    private void separateTextSentencesToWords(Text text) {
        TextElement[] paragraphs = text.getTextElements();

        for (TextElement paragraph : paragraphs) {
            TextElement[] sentences = paragraph.getChildrenElements();

            for (TextElement sentence : sentences) {
                String sent = sentence.getValue();
                removePunctuationMarks(sent);
                String[] sentenceWords = splitSentenceToWords(sent);
                TextElement[] words = transferStringArrayToTextElementArray(sentenceWords);
                sentence.setChildrenElements(words);
            }
        }
    }

    //Оставлено из-за допустимости по условию отсутствия пунктуации после соединения текста.
    private void removePunctuationMarks(String string) {
        string.replaceAll("-", "").replaceAll(",", " ");

    }

    private String[] splitSentenceToWords(String sentence) {
        return sentence.split("[!.?\\- ]+");
    }
}