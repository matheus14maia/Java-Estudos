package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] values = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<5; i++){
            values[i] = input.nextInt();
        }
        double media = 0;
        int i = 0;
        int valorA, valorB = 0;
        int maiorValor = 0;
        while (i < 5){
            valorA = values[i];
            maiorValor = Math.max(valorA, valorB);
            valorB = valorA;
            media += values[i];
            i++;
        }
        System.out.println("Média: "+media/5);
        System.out.println("Maior Valor Digitado: "+maiorValor);
    }
}
