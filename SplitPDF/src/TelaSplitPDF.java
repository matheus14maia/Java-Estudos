import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TelaSplitPDF extends Component {
    private static JTextField txtPathPDF;
    private static JTextField txtOutput;
    public static String getTxtPathPDF() {
        return txtPathPDF.getText();
    }
    public static String getTxtOutput() {
        return txtOutput.getText();
    }

    public static void main(String[] args) {
        JFrame frTela = new JFrame("Separador de PDF");     //Tela inicial

        JLabel lblPath = new JLabel("Selecione o Pdf:");
        lblPath.setBounds(20, 20, 200, 30);
                                                                // Local para selecionar o arquivo
        txtPathPDF = new JTextField();
        txtPathPDF.setBounds(20, 50, 200, 30);

        JLabel lblOutput = new JLabel("Escolha a pasta para salvar:");
        lblOutput.setBounds(20, 80, 200, 30);
                                                                // Escolher a pasta para salvar os pdf
        txtOutput = new JTextField();
        txtOutput.setBounds(20, 110, 200, 30);

        JButton btnArquivo = new JButton("Arquivo");
        btnArquivo.setBounds(240, 50, 100, 28);
        // Botão para Abrir tela com opção de escolha do arquivo pdf
        btnArquivo.addActionListener(e -> {
            JFileChooser file = new JFileChooser();
            int UserChoice = file.showOpenDialog(null);
            if (UserChoice == JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                txtPathPDF.setText(selectedFile.getPath());
            }
            if(UserChoice == JFileChooser.CANCEL_OPTION) {
                txtPathPDF.setText("Nenhum arquivo selecionado");
            }
            //System.out.printf(getTxtPathPDF()+"\n");
        });

        JButton btnPasta = new JButton("Pasta");
        btnPasta.setBounds(240, 110, 100, 28);
        // Botão para escolha da pasta onde irá salvar os pdf separados
        btnPasta.addActionListener(e -> {
            JFileChooser folder = new JFileChooser();
            folder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int option = folder.showOpenDialog(null);
            if (option == JFileChooser.APPROVE_OPTION){
                File selectedFolder = folder.getSelectedFile();
                txtOutput.setText(selectedFolder.getPath());
            }if (option == JFileChooser.CANCEL_OPTION){
                txtOutput.setText("Nenhuma pasta selecionada");
            }
            //System.out.printf(getTxtOutput()+"\n");
        });

        JButton btnSeparar = new JButton("Separar");
        btnSeparar.setBounds(60, 150, 100, 28); //botao para chamar a funçao e separar o arquivo
        btnSeparar.addActionListener(e -> {
            try {
                SplitPDF.main();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        frTela.add(lblPath);
        frTela.add(txtPathPDF);
        frTela.add(btnArquivo);
        frTela.add(lblOutput);
        frTela.add(txtOutput);
        frTela.add(btnPasta);
        frTela.add(btnSeparar);

        frTela.setSize(375, 300);
        frTela.setLocationRelativeTo(null);
        frTela.setLayout(null);
        frTela.setVisible(true);
        frTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
