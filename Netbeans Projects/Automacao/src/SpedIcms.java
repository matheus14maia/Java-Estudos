/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SpedIcms {
    public static void main() throws Exception, InterruptedException {
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
                Thread.sleep(750);
                if (c.contains(j+1)){
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }
            }
            Thread.sleep(1000);
            empresa = Integer.toString(k);
            Screenshot.main("ICMS"+empresa);    //tirar print
            Thread.sleep(1000);
            if (Screenshot.getPercent() > 4){
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

                Thread.sleep(500);
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
                pasta1 = pasta;
                /*if(pasta.equals("FERNANDO MAIA DE OLIVEIRA_76772616120")){
                    Procuracao.main();
                }*/

                Thread.sleep(1000);
                robot.mouseMove(875, 567);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // selecionar empresa
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                Thread.sleep(3000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);      // entrar na tela de pesquisa
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                for (int i = 0; i < 7; i++) {
                    Thread.sleep(700);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                }
                for (int i = 0; i < 4; i++) {   // escolher tipo de sped icms
                    Thread.sleep(800);
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.keyRelease(KeyEvent.VK_DOWN);
                }
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                Thread.sleep(1000);     // periodo de escrituração
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);

                Thread.sleep(1000);
                robot.mouseMove(652, 339);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                Thread.sleep(1000);     // selecionar quadrados
                robot.mouseMove(651, 420);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                for (int i = 0; i < 4; i++) {
                    Thread.sleep(1000);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                }
                Thread.sleep(3000);
                Data.data(robot, TelaPeriodo.getTxtDataInicial());      //Data Inicial

                Thread.sleep(2000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                Thread.sleep(3000);
                Data.data(robot, TelaPeriodo.getTxtDataFinal());        //Data Final

                Thread.sleep(2000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_TAB);      // pesquisar speds
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(5000);
                ScreenshotItens.main("Itens_ICMS".concat(empresa), "Icms");
                Thread.sleep(3500);
                if (ScreenshotItens.getPercent() > 3.0) {
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } else {
                    Thread.sleep(4000);
                    robot.mouseMove(411, 452);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // selecionar todas speds da pesquisa
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(1000);
                    robot.mouseMove(777, 612);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // pesquisar todas
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);

                    Thread.sleep(1000);
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    for (int i = 0; i < 6; i++) {
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_TAB);
                        robot.keyRelease(KeyEvent.VK_TAB);
                    }
                    Thread.sleep(800);
                    robot.keyPress(KeyEvent.VK_ENTER);      // ir para tela de download das speds
                    robot.keyRelease(KeyEvent.VK_ENTER);

                    Thread.sleep(5000);
                    robot.mouseMove(570, 259);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // selecionar pesquisa
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(10000);
                    robot.mouseMove(419, 435);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // todos os arquivos
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(5000);
                    robot.mouseMove(433, 132);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // baixar
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    Thread.sleep(50000);

                    MoveFiles.main(path, targetString);
                }
                Thread.sleep(2000);
                robot.mouseMove(1161, 25);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // Fechar receitanet
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
            Thread.sleep(10000);
            RunJar.main();
        }

        for (int l = 0; l < 12; l++) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(15000);
        SpedEcf.main();
    }
}
