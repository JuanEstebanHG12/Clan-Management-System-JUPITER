package com.jupiter.src.persistance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Handler {

    private String basePath;

    public Handler(String basePath) {
        this.basePath = basePath;
    }

    public List<String[]> read(String fileName) {
        List<String[]> dataList = new ArrayList<>();
        String line;

        String fullPath = basePath + File.separator + fileName;

        try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }
}