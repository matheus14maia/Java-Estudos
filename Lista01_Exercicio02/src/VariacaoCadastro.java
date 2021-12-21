import java.util.Scanner;

class VariacaoCadastro {
    static void quantidadeCadastro(Scanner input) {
        int n;
        n = input.nextInt();
        Cereais[] cereais = new Cereais[n];
        int i;

        for (i=0; i<n; i++){
            Cereais cereal = new Cereais();
            System.out.printf("Type about the %dº cereal \n", i+1);
            System.out.println("Type the name: ");
            cereal.nome = input.next();
            System.out.println("Type the mineral: ");
            cereal.minerais = input.next();
            System.out.println("Type if has gluten: ");
            cereal.gluten = input.next();
            System.out.println("Type the fibers percentage in Decimal: ");
            cereal.teorDeFibras = input.nextDouble();
            cereais[i] = cereal;
        }

        i = 0;
        while(i < cereais.length){
            System.out.printf("Esse é o %dº cereal \n", (i+1));
            System.out.println("Name: "+cereais[i].nome+" - Mineral: "+cereais[i].minerais+" - Has gluten: "+
                    cereais[i].gluten+" - Fiber Percent: "+(cereais[i].teorDeFibras*100)+"%");
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
