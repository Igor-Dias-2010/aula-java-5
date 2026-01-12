package com.igor;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] IntNumbers = new int[5];

        for(int i = 0; i < IntNumbers.length; i++){
            System.out.println("Digite um número inteiro: ");
            IntNumbers[i] = sc.nextInt();
        }
        for(int i = 0; i < IntNumbers.length; i++){
            System.out.println(IntNumbers[i]);
        }

        sc.close();
    }
}