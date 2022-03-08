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

        System.out.printf("Defina o status do robô %d", robo1.getIdentifier());
        robo1.setStatus(input.next());
        if(robo1.getStatus().equalsIgnoreCase("ligar")){
            System.out.println("Informe uma operação:");
            robo1.setStatus(input.next());
            if (robo1.getStatus().equalsIgnoreCase("andar")){
                robo1.setPosicaoX(input.nextInt());
                robo1.setPosicaoY(input.nextInt());
                robo1.toString();
            }
            if (robo1.getStatus().equalsIgnoreCase("aspirar")){
                robo1.setPorcentagem(input.nextFloat());
                robo1.toString();
            }
            if (robo1.getStatus().equalsIgnoreCase("parar")){
                System.out.println("O robo está parado");
                robo1.toString();
            }
        }else {
            System.out.println("O robô está desligado, primeiro ligue o robô, antes de qualquer operação");
        }

    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            execute(input);
        }
    }
}
