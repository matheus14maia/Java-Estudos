import java.util.Scanner;

public class CadastroCereais {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Cereais c1 = new Cereais();
        System.out.println("Type the name: ");
        c1.nome = input.next();
        System.out.println("Type the mineral: ");
        c1.minerais = input.next();
        System.out.println("Type if has gluten:");
        c1.gluten = input.next();
        System.out.println("Type the blubber percentage in Decimal");
        c1.teorDeGordura = input.nextDouble();
    }
}
