package AreaDoCirculo;
import java.util.Scanner;

public class Desafio1002 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaCircunferencia(raio);
        System.out.printf("A= %.4f", area);

        scanner.close();
    }

    public static double calcularAreaCircunferencia (double raio) {
        double pi = 3.14159;
        return pi * (raio * raio);
    }
}

