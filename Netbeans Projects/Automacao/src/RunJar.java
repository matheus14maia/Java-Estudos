/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class RunJar {
    public static void main() throws IOException{
        String filePath = "C:\\Program Files (x86)\\Programas RFB\\Receitanet BX\\receitanetbx-gui-1.9.15.jar";
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(filePath));

    }
}
