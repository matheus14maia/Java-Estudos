import java.util.Scanner;

class Application {
    private static void execute(Scanner input){
        int id, id2;
        double reserv, reserv2;
        System.out.println("Informe a identificação do 1º robo: ");
        id = input.nextInt();
        System.out.println("Informe o volume do reservatorio: ");
        reserv = input.nextDouble();
        Robo robo1 = new Robo(id, reserv);

        System.out.println("Informe a identificação do 2º robo: ");
        id2 = input.nextInt();
        System.out.println("Informe o volume do reservatorio: ");
        reserv2 = input.nextDouble();
        Robo robo2 = new Robo(id2, reserv2);

    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            execute(input);
        }
    }
}
