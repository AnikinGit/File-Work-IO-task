package app;

import java.io.*;

public class FileReadService {
    StringBuilder text = new StringBuilder();


    public String readFile(String pathToTheFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(pathToTheFile)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text.toString();

    }
}
