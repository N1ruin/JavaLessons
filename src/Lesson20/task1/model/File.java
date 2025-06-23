package Lesson20.task1.model;

import Lesson20.task1.types.FileType;

import java.util.Objects;

public class File {
    private String name;
    private float size;
    private FileType type;

    public File(String name, float size, FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
