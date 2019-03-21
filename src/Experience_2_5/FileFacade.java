package Experience_2_5;

import java.io.IOException;

public class FileFacade {
    private Read read;
    private Encryption encryption;
    private Save save;

    public FileFacade() {
        this.read = new Read();
        this.encryption = new Encryption();
        this.save = new Save();
    }

    public void run(){
        try {
            String text = read.readFile();
            text =  encryption.encrypt(text);
            save.saveFile(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
