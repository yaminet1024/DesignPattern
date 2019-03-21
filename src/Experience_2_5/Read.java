package Experience_2_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public String readFile() throws IOException {
        String message;
        File file = new File("D:\\projects\\上课实验\\DesignPattern\\src\\Experience_2_5\\data.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        StringBuilder stringBuffer = new StringBuilder();
        while ((message=in.readLine())!=null){
            stringBuffer.append(message).append("\n");
        }
        in.close();
        return stringBuffer.toString();
    }
}
