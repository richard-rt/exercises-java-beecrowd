package ProdutoSimples;

import java.util.Scanner;

public class Desafio1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        int resultadoCalcProd = calculaProduto(primeiroNumero, segundoNumero);

        System.out.println("PROD = " + resultadoCalcProd);
    }
    public static  int calculaProduto(int primeiroNumero, int segundoNumero){
        int produto = primeiroNumero * segundoNumero;
        return produto;
    }

}
