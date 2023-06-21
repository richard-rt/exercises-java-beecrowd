# Aprendizados
* **Utilização do System.out.printf()**

Ultilizado para formatar valores, no caso do exercício precisaria formatar com 5 dígitos após o ponto decimal.

Os parametros do printf(formato, arguemento)

Ex: System.out.printf( "MEDIA = " + "%.5f", resultadoCalculo);


* **Utilizado do método sum()**

O método sum() da classe Double retorna a soma de dois argumentos duplos iguais à operação executada pelo operador '+'. 

Podendo ser usado com outros tipos como Float e int.


## Descrição do problema
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

* Entrada

O arquivo de entrada contém 2 valores com uma casa decimal cada um.

* Saída

Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".