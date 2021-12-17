import java.util.Scanner;

public class CadastroCereais {
    static void cadastro(Scanner input){
        Cereais c1 = new Cereais();
        System.out.println("Type the name: ");
        c1.nome = input.next();
        System.out.println("Type the mineral: ");
        c1.minerais = input.next();
        System.out.println("Type if has gluten: ");
        c1.gluten = input.next();
        System.out.println("Type the fibers percentage in Decimal: ");
        c1.teorDeFibras = input.nextDouble();
        System.out.println("Cereal - Name: "+ c1.nome +" - Mineral: "+ c1.minerais +
                " - Gluten: "+ c1.gluten +" - Fibers Percent: "+ (c1.teorDeFibras*100) +"%");
    }
    public static void main(String[] args){
        String cadastrarNovamente;
        try(Scanner input = new Scanner(System.in)) {
            cadastro(input);
            System.out.println("Deseja cadastrar mais um cereal?");
            cadastrarNovamente = input.next();
            while (cadastrarNovamente != null){
                if (cadastrarNovamente.equals("Sim") || cadastrarNovamente.equals("sim")) {
                    cadastro(input);
                    System.out.println("Deseja cadastrar mais um cereal? Sim ou Não");
                    cadastrarNovamente = input.next();
                } else {
                    cadastrarNovamente = null;
                }
            }
        }
    }
}
