package com.igor;

import java.util.Scanner;
public class Desafio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        System.out.println("Digite o primeiro nome: ");
        nomes[0] = sc.nextLine();

        System.out.println("Digite segundo nome: ");
        nomes[1] = sc.nextLine();

        System.out.println("Digite o terceiro nome: ");
        nomes[2] = sc.nextLine();

        System.out.println("Digite o quarto nome: ");
        nomes[3]  = sc.nextLine();

        System.out.println(nomes[2]);

        sc.close();
    }
}