import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
public class Certificados {   
    public static void main() throws Exception, InterruptedException{
        RunJar.main();
        String pasta1 = "";
        boolean cont = true;
        String empresa;
        ArrayList<Integer> c = new ArrayList();

        Robot robot = new Robot();
        for (int k = 1; cont; k++) {
            Thread.sleep(10000);
            for (int j = 0; j < k ; j++) {
                robot.keyPress(KeyEvent.VK_DOWN); // escolher empresa pra baixar sped
                robot.keyRelease(KeyEvent.VK_DOWN);
                Thread.sleep(1500);
                if (c.contains(j+1)){
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }
            }
            Thread.sleep(1000);
            empresa = Integer.toString(k);
            Screenshot.main("ICMS"+empresa);    //tirar print
            Thread.sleep(1000);
            if (Screenshot.getPercent() >= 4){
                c.add(k);                   //adicionar as empresas com certificados fora da validade a lista
                Thread.sleep(1500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                for (int i = 0; i < 9; i++) {
                    Thread.sleep(1500);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                }
                Thread.sleep(1500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } else {
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);

                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);     // Copiar nome da empresa
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_C);
                Thread.sleep(500);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_C);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

        /*        Thread.sleep(500);
                String pasta = NomeEmpresa.main();      // Criar Pasta
                String path = "C:\\Users\\FicusMaheus\\Documents\\Arquivos ReceitanetBX";
                String sped = "D:\\Speds\\";
                String icms = "\\EFDICMS\\";
                String ano = TelaPeriodo.getTxtDataFinal().substring(4).concat("\\");
                String mes = TelaPeriodo.getTxtDataInicial().substring(2, 4);
                Path target = Paths.get(sped + pasta + icms + ano + mes);
                String targetString = sped.concat(pasta.concat(icms.concat(ano.concat(mes))));
                Files.createDirectories(target);
                if (pasta1.equals(pasta)) {
                     cont = false;
                }
                if(pasta.equals("FERNANDO MAIA DE OLIVEIRA_76772616120")){
                    Procuracao.main();
                    int c = k;
                }

                pasta1 = pasta;*/
            }
        }
    }
}
