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

public class SpedEcf {
    public static void main() throws Exception {
        RunJar.main();
        Thread.sleep(10000);
        String pasta1 = "";
        boolean cont = true;
        String empresa;
        ArrayList<Integer> c = new ArrayList();

        Robot robot = new Robot();
        for (int k = 1; cont; k++) {
            Thread.sleep(15000);
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
            Screenshot.main("ECF"+empresa);
            Thread.sleep(1000);
            if (Screenshot.getPercent() >= 2.4){
                c.add(k);               //adicionar as empresas com certificados fora da validade a lista
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
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_C);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(1000);
                String pasta = NomeEmpresa.main();
                String path = "C:\\Users\\FicusMaheus\\Documents\\Arquivos ReceitanetBX";
                String sped = "D:\\Sped";
                String ecf = "ECF";
                String ano = TelaPeriodo.getTxtDataFinal().substring(4);
                String mes = TelaPeriodo.getTxtDataInicial().substring(2, 4);
                Path target = Paths.get(sped, pasta, ecf, ano, mes);
                Files.createDirectories(target);
                if (pasta1.equals(pasta)) {
                    cont = false;
                }
                pasta1 = pasta;

                Thread.sleep(2000);
                robot.mouseMove(875, 567);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // seleciona empresa
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);      // entrar na tela de pesquisa
                Thread.sleep(700);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                for (int i = 0; i < 7; i++) {
                    Thread.sleep(700);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                }
                for (int i = 0; i < 3; i++) {   // escolher tipo de sped ecf
                    Thread.sleep(800);
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.keyRelease(KeyEvent.VK_DOWN);
                }

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                Thread.sleep(1000);     // tipo de arquivo: escrituração
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                Thread.sleep(1000);     // periodo por entrega
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);

                Thread.sleep(2000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_SHIFT);

                Thread.sleep(1000);     // periodo por escrituração
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);

                Thread.sleep(1000);
                Data.data(robot, TelaPeriodo.getTxtDataInicial());      //Data Inicial

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                Thread.sleep(1000);
                Data.data(robot, TelaPeriodo.getTxtDataFinal());        //Data Final

                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_TAB);      // pesquisar speds
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(3000);
                ScreenshotItens.main("Itens_ECF" + empresa);
                Thread.sleep(1000);
                if (ScreenshotItens.getPercent() >= 5.0) {
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } else {
                    Thread.sleep(7000);
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
                    Thread.sleep(300000);

                    MoveFiles.main(path, target.toString());
                }
            }
            Thread.sleep(2000);
            robot.mouseMove(1161, 25);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // fechar receitanet
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(5000);
            RunJar.main();
            Thread.sleep(10000);
        }
        for (int l = 0; l < 8; l++) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(15000);
        SpedContabil.main();
    }
}