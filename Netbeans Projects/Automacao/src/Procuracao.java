/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Procuracao {
    public static void main() throws AWTException, InterruptedException{

    Robot robo = new Robot();

    Thread.sleep(1000);
    robo.keyPress(KeyEvent.VK_TAB);
    robo.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(500);
    robo.keyPress(KeyEvent.VK_DOWN);
    robo.keyRelease(KeyEvent.VK_DOWN);  //procuracao
    Thread.sleep(500);
    robo.keyPress(KeyEvent.VK_TAB);
    robo.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(500);
    robo.keyPress(KeyEvent.VK_DOWN);
    robo.keyRelease(KeyEvent.VK_DOWN);   //CNPJ
    Thread.sleep(500);
    robo.keyPress(KeyEvent.VK_TAB);
    robo.keyRelease(KeyEvent.VK_TAB);

    }
}
