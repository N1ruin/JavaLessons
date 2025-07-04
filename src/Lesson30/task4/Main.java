package Lesson30.task4;

import Lesson30.task4.model.Text;
import Lesson30.task4.service.TextJoiner;
import Lesson30.task4.service.TextSeparator;

public class Main {
    public static void main(String[] args) {
        String testText = "Наступила зима, и мы поехали кататься на санках с горы. С горы мы ездим кататься вместе с моим младшим братом Димой. Дима очень любит играть в снежки. Я в снежки играю плохо, и он всегда побеждает. Но победа не даётся ему в хоккее, хотя я и тренировал его.\n" +
                "Зима прекрасное время года. За окном хлопьями падает снег. В школу можно не ходить. А ещё зимой есть снежные горки. В это время года летают снегири, и мы мастерим для них кормушки. Самый большой праздник - Новый год - тоже зимой!";

        Text text = new Text(testText);

        TextSeparator textSeparator = new TextSeparator();
        textSeparator.separateText(text);

        TextJoiner textJoiner = new TextJoiner();
        String sourceText = textJoiner.joinText(text);
        System.out.println(sourceText);
    }
}
