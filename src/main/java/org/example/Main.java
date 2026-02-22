package org.example;

import java.util.Locale;
import java.util.Scanner;

public class maior{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        long maior = 0;
        int linha = 0;
        for (int i = 0; i<100; i++){
            long N = sc.nextLong();
            if (N > maior) {
                maior = N;
                linha = i + 1;
            }
        }
           System.out.println(maior);
           System.out.println(linha);
           sc.close();
        }
    }
