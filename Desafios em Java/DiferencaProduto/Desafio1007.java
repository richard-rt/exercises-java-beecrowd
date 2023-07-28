package DiferencaProduto;

import java.util.Scanner;

public class Desafio1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNum = Integer.parseInt(scanner.nextLine());
        int segundoNum = Integer.parseInt(scanner.nextLine());
        int terceiroNum = Integer.parseInt(scanner.nextLine());
        int quartoNum = Integer.parseInt(scanner.nextLine());

        int difererca = (primeiroNum * segundoNum) - (terceiroNum * quartoNum);

        System.out.print("DIFERENCA = " + difererca);
    }
}
