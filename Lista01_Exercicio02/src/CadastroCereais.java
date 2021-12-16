import java.util.Scanner;

public class CadastroCereais {
    public static void main(String[] args){
       // String cadastrarNovamente;

        try (Scanner input = new Scanner(System.in)) {
            Cereais c1 = new Cereais();
            System.out.println("Type the name: ");
            c1.nome = input.next();
            System.out.println("Type the mineral: ");
            c1.minerais = input.next();
            System.out.println("Type if has gluten:");
            c1.gluten = input.next();
            System.out.println("Type the fibers percentage in Decimal");
            c1.teorDeFibras = input.nextDouble();
            System.out.println("Cereal - Name: "+ c1.nome +" - Mineral: "+ c1.minerais +
                    " - Gluten: "+ c1.gluten +" - Fibers Percent: "+ (c1.teorDeFibras*100)+"%");
            /*System.out.println("Deseja cadastrar um cereal? Sim ou Nao");
            cadastrarNovamente = input.next(); */
        }
    }
}
