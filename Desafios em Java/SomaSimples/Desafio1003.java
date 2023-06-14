package SomaSimples;

import java.util.Scanner;

public class Desafio1003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int primeiroNum = scanner.nextInt();
        int segundoNum = scanner.nextInt();

        int resultadoSoma = somaValores(primeiroNum, segundoNum);
        System.out.println("X = " + resultadoSoma);

        scanner.close();
    }

    public static int somaValores(int primeiroNum, int segundoNum) {
        int soma = primeiroNum + segundoNum;
        return soma;
    }

}
