import javax.swing.*;

public class Tela {
    private static JMenuItem i1, i2, i3, i4;
    private static JMenu arquivo, planilha;

    private static void tela(){
        JFrame frTela = new JFrame("Mova se");

        JMenuBar menuBar = new JMenuBar();
        arquivo = new JMenu("Arquivo");
        i1 = new JMenuItem("Criar");

        planilha = new JMenu("Planilha");
        i1 = new JMenuItem("Peças");
        i2 = new JMenuItem("Gastos");
        i3 = new JMenuItem("Vendas");
        i4 = new JMenuItem("Lucros");
        planilha.add(i1);
        planilha.add(i2);
        planilha.add(i3);
        planilha.add(i4);

        menuBar.add(planilha);

        frTela.setJMenuBar(menuBar);
        frTela.setSize(1280, 690);
        frTela.setLocationRelativeTo(null);
        frTela.setLayout(null);
        frTela.setVisible(true);
        frTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        tela();
    }
}
