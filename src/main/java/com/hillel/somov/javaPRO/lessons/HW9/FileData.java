package com.hillel.somov.javaPRO.lessons.HW9;

public class FileData {
    private  String name;
    private  String path;
    private  int size;
    public FileData(String name, String path, int size) {
        this.name = name;
        this.path = String.valueOf(path);
        this.size = size;
    }
    public String getPath() {
        return path;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "FileData{" +
                "name = '" + name + '\'' +
                ", path = '" + path + '\'' +
                ", size = " + size + " Bites" +
                '}' + "\n";
    }

}
