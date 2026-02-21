package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;
        int min;
       if (a > b){
            max = a;
            min = b;
       }
       else {
           max = b;
           min = a;
       }
       int soma = 0;
       for(int i = min + 1; i < max; i++){
           if (i % 2 != 0){
               soma = soma + i;
           }
       }
       System.out.println(soma);



           sc.close();
        }
    }
