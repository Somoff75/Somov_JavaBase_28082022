package com.hillel.somov.javaPRO.lessons.HW9;

import java.util.*;

public class FileNavigator {
    private final Map<String, List<FileData>> files = new HashMap<>();

    public void add(FileData fileData) {
        if (files.containsKey(fileData.getPath())) {
            files.get(fileData.getPath()).add(fileData);
        } else {
            files.put(fileData.getPath(), new ArrayList<>(List.of(fileData)));
        }
    }

    public String find(String path) throws Exception {
        try {
            return files.get(path).toString();
        } catch (Exception e) {
            throw new Exception("Path not found");
        }
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileDataList : files.values()) {
            for (FileData fileData : fileDataList) {
                if (fileData.getSize() <= size) {
                    result.add(fileData);
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileDataList : files.values()) {
            result.addAll(fileDataList);
        }
        result.sort(Comparator.comparing(FileData::getSize));
        return result;
    }

    public static void main(String[] args) throws Exception {

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("file1.doc", "C:\\Users\\user\\desktop", 36));
        fileNavigator.add(new FileData("file2.txt", "C:\\Users\\user\\OneDrive", 100));
        fileNavigator.add(new FileData("file3.exe", "C:\\Program file\\Game\\", 122));
        fileNavigator.add(new FileData("file4.txt", "C:\\Program file\\Game\\Guide", 234));
        fileNavigator.add(new FileData("file5.jar", "C:\\Program file\\Java\\", 444));

        System.out.println(fileNavigator.find("C:\\Users\\user\\desktop"));
        System.out.println(fileNavigator.filterBySize(200));
        System.out.println(fileNavigator.sortBySize());
        fileNavigator.remove("C:\\Program file\\Java\\");
        System.out.println(fileNavigator.find("C:\\Program file\\Java\\"));

    }
}

