package Lesson20.task1.withTryCatch;

import Lesson20.task1.model.File;
import Lesson20.task1.service.FileService;
import Lesson20.task1.types.FileType;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileService fileService = new FileService();
        File[] files = fileService.getFiles();

        initService(files);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название искомого файла");
        String fileName = scanner.nextLine();
        scanner.close();

        File file = fileService.findFile(fileName);
        fileService.printFileInfo(file);
    }

    private static void initService(File[] files) {
        files[0] = new File("1", 2.5f, FileType.VIDEO);
        files[1] = new File("2", 4.2f, FileType.AUDIO);
        files[2] = new File("3", 9.9f, FileType.IMAGE);
        files[3] = new File("4", 2.9f, FileType.TEXT);
        files[4] = new File("5", 12.4f, FileType.VIDEO);
    }
}
