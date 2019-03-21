package Experience_2_5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Save {

    public  void saveFile(String text) throws IOException {
        File file = new File("D:\\projects\\上课实验\\DesignPattern\\src\\Experience_2_5\\data.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        BufferedWriter writer=new BufferedWriter(write);
        writer.write(text);
        writer.close();
    }
}
