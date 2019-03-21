package CourseDesign.Utils;

import CourseDesign.Shape.BaseShape;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteToFile {
    List<BaseShape> baseShapes;

    public WriteToFile(List<BaseShape> baseShapes) {
        this.baseShapes = baseShapes;
    }

    public void  write(File file){
        FileOutputStream out;
        try {
            out = new FileOutputStream(file);
            ObjectOutputStream objOut=new ObjectOutputStream(out);
            objOut.writeObject(baseShapes);
            objOut.flush();
            objOut.close();
            System.out.println("write object success!");
        } catch (IOException e) {
            System.out.println("write object failed");
            e.printStackTrace();
        }
    }
}
