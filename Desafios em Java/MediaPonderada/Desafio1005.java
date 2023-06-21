package MediaPonderada;

import java.util.Scanner;

public class Desafio1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiraNota = scanner.nextDouble();
        double segundaNota = scanner.nextDouble();

        double resultadoCalculo = calculaMediaPonderada(primeiraNota, segundaNota);
        System.out.printf("MEDIA = " + "%.5f", resultadoCalculo);

    }

    public static double calculaMediaPonderada(double primeiraNota, double segundaNota) {
        double pesoPrimeiraNota = 3.5;
        double pesoSegundaNota = 7.5;
        return ((primeiraNota * pesoPrimeiraNota) + (segundaNota * pesoSegundaNota)) / Double.sum(pesoPrimeiraNota, pesoSegundaNota);
    }
}
