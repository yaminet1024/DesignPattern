package Experience_1_5;

import javax.swing.*;

public class Dialog {

    private static JDialog dialog = null;

    public static JDialog getInstance(){
        if (dialog == null){
            dialog = new JDialog();
            return dialog;
        }else {
            System.out.println("您当前已经创建的一个窗口");
        }
        return dialog;
    }

    private Dialog(){
        //doNothing
    }

}
