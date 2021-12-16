package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 4 números: ");
        int x, y, z, w;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        w = input.nextInt();
        int sum, mult;
        sum = x+y+z+w;
        mult = x*y*z*w;
        System.out.println("Soma: "+sum);
        System.out.println("Multiplicação: "+mult);
    }
}
