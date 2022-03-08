import javax.swing.*;

public class TelaPeriodo {
    private static JTextField txtDataInicial;
    private static JTextField txtDataFinal;

    public static String getTxtDataInicial() {
        return txtDataInicial.getText();
    }
    public static String getTxtDataFinal() {
        return txtDataFinal.getText();
    }

    public static void main(String[] args) {
        JFrame frTela = new JFrame("Período Speds");

        JLabel lblDataInic = new JLabel("Data inicial (ddmmaaaa):");
        lblDataInic.setBounds(20, 50, 200, 30);
        txtDataInicial = new JTextField();
        txtDataInicial.setBounds(20, 80, 200, 30);


        JLabel lblDataFinal = new JLabel("Data Final (ddmmaaaa):");
        lblDataFinal.setBounds(270, 50, 200, 30);
        txtDataFinal = new JTextField();
        txtDataFinal.setBounds(270, 80, 200, 30);

        JButton btnBaixar = new JButton("Baixar Speds");
        btnBaixar.setBounds(160, 150, 150, 30);
        btnBaixar.addActionListener(e -> {
            try {
                SpedIcms.main(args);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        frTela.setSize(500, 250);
        frTela.setLocation(200, 250);

        frTela.add(lblDataInic);
        frTela.add(lblDataFinal);
        frTela.add(txtDataInicial);
        frTela.add(txtDataFinal);
        frTela.add(btnBaixar);

        frTela.setLayout(null);
        frTela.setVisible(true);
        frTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
