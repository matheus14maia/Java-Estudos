package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String aluno;
        float n1, n2, n3, media;

        aluno = input.next();
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();

        media = (n1+n2+n3)/3;

        System.out.println("Aluno: "+aluno);
        System.out.println("Média: "+media);
    }
}