import java.awt.*;
import java.io.File;
import java.io.IOException;


public class RunJar {
    public static void main(String[] args) throws IOException{
        String filePath = "C:\\Program Files (x86)\\Programas RFB\\Receitanet BX\\receitanetbx-gui-1.9.15.jar";
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(filePath));

    }
}
