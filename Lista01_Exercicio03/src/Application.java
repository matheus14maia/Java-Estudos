import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Application {
    static void cadastroMoradores(Scanner input) {
        int i, n;
        n = input.nextInt();
        ArrayList<Moradores>moradorList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (i=0; i<n; i++){
            Moradores moradores = new Moradores();
            System.out.printf("%dº Morador\n", i+1);
            System.out.println("Nome: ");
            moradores.setNome(input.next());
            System.out.println("CPF: ");
            moradores.setCpf(input.next());
            System.out.println("Telefone: ");
            moradores.setTelefone(input.next());
            System.out.println("Data(dd/mm/aaaa): ");
            Date date = null;
            try {
                date = dateFormat.parse(input.next());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            moradores.setDataNascimento(date);
            System.out.println("Sexo: ");
            moradores.setSexo(input.next().charAt(0));
            System.out.println("Código de Acesso: ");
            moradores.setCodigoAcesso(input.next());
            moradorList.add(moradores);

        }
        for (Moradores morador : moradorList){
            System.out.println("Morador ("+Moradores.getID()+") - "+morador.getNome()+" - "+morador.getCpf()+" - "
                    +morador.getTelefone()+" - "+dateFormat.format(morador.getDataNascimento())+" - "+morador.getSexo()+" - "
                    +morador.getCodigoAcesso());
        }

    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Quantos moradores deseja cadastrar?");
            cadastroMoradores(input);
        }
    }
}
