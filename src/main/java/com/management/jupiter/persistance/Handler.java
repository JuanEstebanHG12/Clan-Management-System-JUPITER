package com.management.jupiter.persistance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Handler {

    private final String basePath = "./data";

    public Handler() {
        File dir = new File(basePath);
        if (!dir.exists()) dir.mkdirs();
    }

    public List<String[]> read(String fileName) {
        List<String[]> dataList = new ArrayList<>();
        File file = new File(basePath, fileName);

        try {
            if (!file.exists()) file.createNewFile();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    dataList.add(data);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }

    public void write(String fileName, List<String[]> data) {
        File file = new File(basePath, fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}