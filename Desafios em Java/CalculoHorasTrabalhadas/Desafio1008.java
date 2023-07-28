package CalculoHorasTrabalhadas;

import java.util.Scanner;

public class Desafio1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = Integer.parseInt(scanner.nextLine());
        int horaTrabalhada = Integer.parseInt(scanner.nextLine());
        double valorHora = Double.parseDouble(scanner.nextLine());

        double salario = calculaSalario(horaTrabalhada, valorHora);

        System.out.print("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ " + "%.2f", salario);
    }
    public static double calculaSalario(double horaTrabalhada, double valorHora){
        return valorHora * horaTrabalhada;
    }
}
