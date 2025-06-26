package Lesson28.task3;

import Lesson28.task3.service.ArraySearchService;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "4", "fdafa"};

        ArraySearchService<String> arraySearchService = new ArraySearchService<>(strings);

        System.out.println(arraySearchService.search("0"));
    }
}
