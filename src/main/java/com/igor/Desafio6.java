package com.igor;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] IntNumbers = new int[5];

        for(int i = 0; i < IntNumbers.length; i++){
            System.out.println("Digite um número: ");
            IntNumbers[i] = sc.nextInt();
        }
        int BiggerIntNumber = IntNumbers[0];

        for(int i = 0; i < IntNumbers.length; i++){
            if(IntNumbers[i] > BiggerIntNumber){
                BiggerIntNumber = IntNumbers[i];
            }
        }
        System.out.println("O maior número é: " + BiggerIntNumber + ".");


        sc.close();
    }
}