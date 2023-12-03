package app;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String handleFile(String myText, String fileName) {
        try {
            FileOutputStream fout =
                    new FileOutputStream(FolderUrl.folderPath + fileName + ".txt");

            byte[] byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);

            fout.close();
        } catch (IOException ex) {
            return ex.getMessage();
        }

        return "Success!";
    }
}