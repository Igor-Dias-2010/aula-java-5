package com.igor;
import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[3];

        System.out.println("Digite um número: ");
        number[0] = sc.nextInt();

        System.out.println("Digite outro número: ");
        number[1] = sc.nextInt();

        System.out.println("Digite outro número: ");
        number[2] = sc.nextInt();


        System.out.println(number[0]);
        System.out.println(number[2]);

        sc.close();
    }
}