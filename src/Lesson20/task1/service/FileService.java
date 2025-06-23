package Lesson20.task1.service;

import Lesson20.task1.model.File;

import java.io.FileNotFoundException;

public class FileService {
    private File[] files = new File[5];

    public File findFile(String name) throws FileNotFoundException {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new FileNotFoundException("file not found");
    }

    public void printFileInfo(File file) {
        System.out.println(file);
    }

    public File[] getFiles() {
        return files;
    }
}
