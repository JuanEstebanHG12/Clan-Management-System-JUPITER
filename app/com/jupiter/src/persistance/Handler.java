package persistance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Handler {

    private final String basePath;

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
    public void write(String fileName, List<String[]> data) {
        String fullPath = basePath + File.separator + fileName;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fullPath))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
}