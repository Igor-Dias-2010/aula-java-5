package com.igor;

import java.util.Locale;
import java.util.Scanner;

public class Desafio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double[] Decinumbers = new double[2];

        System.out.println("Digite um número decimal: ");
        Decinumbers[0] = sc.nextDouble();

        System.out.println("Digite outro número decimal: ");
        Decinumbers[1] = sc.nextDouble();

        System.out.println("Soma = " + (Decinumbers[0] + Decinumbers[1]));

        sc.close();
    }
}
