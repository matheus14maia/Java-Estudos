/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
import javax.swing.*;

public class TelaPeriodo {
    private static JTextField txtDataInicial;
    private static JTextField txtDataFinal;
    private static JTextField txtCnpj;

    public static String getTxtDataInicial() {
        return txtDataInicial.getText();
    }
    public static String getTxtDataFinal() {
        return txtDataFinal.getText();
    }
    public static String getTxtCnpj(){
        return txtCnpj.getText();
    }

    public static void main(String[] args) {
        JFrame frTela = new JFrame("Período Speds");

        JLabel lblDataInic = new JLabel("Data inicial (ddmmaaaa):");
        lblDataInic.setBounds(20, 20, 200, 30);
        txtDataInicial = new JTextField();
        txtDataInicial.setBounds(20, 50, 200, 30);

        JLabel lblDataFinal = new JLabel("Data Final (ddmmaaaa):");
        lblDataFinal.setBounds(270, 20, 200, 30);
        txtDataFinal = new JTextField();
        txtDataFinal.setBounds(270, 50, 200, 30);

        JButton btnBaixar = new JButton("Baixar Speds");
        btnBaixar.setBounds(160, 100, 150, 30);
        btnBaixar.addActionListener(e -> {
            try {                                              //Botão para rodar o programa
                SpedEcf.main();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        JLabel lblCnpj = new JLabel("CNPJ(Procuração): ");
        lblCnpj.setBounds(20, 140, 200, 30);                    // Colocar CNPJ da procuração 
        txtCnpj = new JTextField();
        txtCnpj.setBounds(20, 170, 200, 30);

        frTela.setSize(500, 250);
        frTela.setLocationRelativeTo(null);

        frTela.add(lblDataInic);
        frTela.add(lblDataFinal);
        frTela.add(txtDataInicial);
        frTela.add(txtDataFinal);
        frTela.add(btnBaixar);
        frTela.add(lblCnpj);
        frTela.add(txtCnpj);
        
        frTela.setLayout(null);
        frTela.setVisible(true);
        frTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
