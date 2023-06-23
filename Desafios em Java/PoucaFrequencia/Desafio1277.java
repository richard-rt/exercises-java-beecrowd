package PoucaFrequencia;

import java.util.Scanner;

public class Desafio1277 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a quantidade total de alunos");
        int qtdTotalEstudantes = Integer.parseInt(scanner.nextLine());

        int estudantes;
        String nomeAlunos;
        String[] arreyAlunos;
        String frequencia;
        String[] arreyNota;

        for (int l = 0; l < qtdTotalEstudantes; l++) {

            //System.out.println("Digite a quantidade de alunos");
            estudantes = Integer.parseInt(scanner.nextLine());

            //System.out.println("Digite o nome dos alunos");
            nomeAlunos = scanner.nextLine();
            arreyAlunos = nomeAlunos.split("\\s");

            //System.out.println("Digite as notas dos alunos");
            frequencia = scanner.nextLine();
            arreyNota = frequencia.split("\\s");


            // Percorre notas
            for (int i = 0; i < estudantes; i++) {

                // Array de char's
                char[] b = arreyNota[i].toCharArray();

                int numeroDeNotas = arreyNota[i].length();
                int presencas = 0;
                int faltas = 0;
                char N = 77;
                char P = 80;

                // Percorre array char
                for (int k = 0; k < numeroDeNotas; k++) {
                    if (b[k] == N || b[k] == P) {
                        presencas += 1;

                    } else {
                        faltas += 1;
                    }
                }
                int resultado = (presencas * 100) / numeroDeNotas;

                if (resultado < 75) {
                    System.out.println(arreyAlunos[i] + " ");
                }
            }
        }
    }
}


