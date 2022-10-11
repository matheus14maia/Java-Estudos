import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Procuracao {
    public static void main() throws Exception{

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

        Data.data(robo, TelaPeriodo.getTxtCnpj());

        Thread.sleep(1000);
        robo.mouseMove(875, 567);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK); // selecionar empresa
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}
