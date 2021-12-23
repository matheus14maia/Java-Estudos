import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Application {
    private static void cadastroMoradores(Scanner input, int qtd) {
        int i, n;
        n = qtd;
        ArrayList<Moradores>moradorList = new ArrayList<>();
        ArrayList<Apartamento>apList = new ArrayList<>();
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
        for (i=0; i< moradorList.size(); i++){
            Apartamento ap = new Apartamento();
            System.out.printf("Defina o apartamento do morador %s\n", moradorList.get(i).getNome());
            System.out.println("Bloco:");
            ap.setBloco(input.next().charAt(0));
            System.out.println("Andar e Numero:");
            ap.setAndarNumero(input.nextInt(), input.nextInt());
            if (ap.getAndar() == 0 && ap.getNumero() ==0){
                System.out.println("Insira corretamente o andar e numero:");
                ap.setAndarNumero(input.nextInt(), input.nextInt());
            }
            System.out.println("Metragem:");
            ap.setMetragem(input.nextDouble());
            System.out.println("Situação:");
            ap.setSituacao(input.next());
            ap.setMorador(moradorList.get(i));
            apList.add(ap);
        }
        for (Apartamento apartamento : apList){
            System.out.println("Morador: " + apartamento.getMorador().getNome() + " - Bloco: "+apartamento.getBloco()+
                    " - Andar: " +apartamento.getAndar()+" - Número: "+apartamento.getNumero()+" - Metragem: "+
                    apartamento.getMetragem()+"m² - Situação: "+apartamento.getSituacao());
        }
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Quantos moradores deseja cadastrar?");
            cadastroMoradores(input, input.nextInt());
        }
    }
}
