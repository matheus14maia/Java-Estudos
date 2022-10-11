import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SpedContabil {
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
            Screenshot.main("ECD"+empresa);
            Thread.sleep(1000);
            if (Screenshot.getPercent() > 4){
                c.add(k);           //adicionar as empresas com certificados fora da validade a lista
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
                String sped = "D:\\Speds\\";
                String ecd = "\\ECD\\";
                String ano = TelaPeriodo.getTxtDataFinal().substring(4).concat("\\");
                String mes = TelaPeriodo.getTxtDataInicial().substring(2, 4);
                Path target = Paths.get(sped + pasta + ecd + ano + mes);
                String targetString = sped.concat(pasta.concat(ecd.concat(ano.concat(mes))));
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
                for (int i = 0; i < 2; i++) {   // escolher tipo de sped contabil
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
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(3000);
                ScreenshotItens.main("Itens_ECD" + empresa, "Ecd");
                Thread.sleep(3500);
                if (ScreenshotItens.getPercent() <= 16.0) {
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } else {
                    Thread.sleep(5000);
                    robot.mouseMove(411, 452);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // selecionar todas speds da pesquisa
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    Thread.sleep(1000);
                    robot.mouseMove(777, 612);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // pesquisar todas
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

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
                    Thread.sleep(60000);

                    MoveFiles.main(path, targetString);
                }

                Thread.sleep(2000);
                robot.mouseMove(1161, 25);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);     // fechar receitanet
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
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
        SpedContribuicao.main();
    }
}
