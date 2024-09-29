package DesafioContoleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        try {
            contar(numero1, numero2);

            } catch (ParametrosInvalidosException Exception) {
        } entrada.close();
    }
    static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
        } else {
            int contagem = numero2 - numero1;
            for (int i = 0; i < contagem; i++)
                System.out.println(i+1);
        }
    }
}

