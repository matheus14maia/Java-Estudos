import java.util.Scanner;
import java.util.Vector;

class VariacaoCadastro {
    static void quantidadeCadastro(Scanner input){
        int n;
        int i;

        n = input.nextInt();

        Vector<Cereal> cerealVector = new Vector<>();

        for (i=0; i < n; i++){
            System.out.format("Type about the %dº cereal %n", i+1);
            System.out.println("Type the name, mineral, has gluten, Fibers percent");
            cerealVector.add(new Cereal(input.next(), input.next(), input.next(), input.nextDouble()));
        }
        i = 0;
        for (Cereal cereal : cerealVector){
            System.out.format("Esse é o %dº cereal %n", i+1);
            System.out.println("Name: "+cereal.nome+" - Mineral: "+cereal.minerais+" - Has gluten: "+
                    cereal.gluten+" - Fiber Percent: "+(cereal.teorDeFibras*100)+"%");
            i++;
        }
    }

    public static void main(String[] args){

        System.out.println("Quantos cereais devem ser cadastrados?");
        try(Scanner input = new Scanner(System.in)){
            quantidadeCadastro(input);
        }
    }
}
