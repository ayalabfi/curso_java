package introducao;

import java.util.Scanner;

public class AplicandoBitwise {

    public static void main(String[] args) {

        /*
- Operadores bitwise:

1 - & -> Operação "E" bit a bit;
2 - | -> Operação "Ou" bit a bit;
3 - ^ -> Operação "OU-exclusivo" bit a bit;
4 - 0b -> Antes do valor do int, incluir 0b para informar que o número apresentado será binário;
4.1 - Exemplo: int mask = 0b00100000; (Esse valor é equivalente a 32).

- Esses operadores são utilizados quando é necessário analisar um código bit a bit (0 = falso e 1 = verdadeiro),
os operadores dão resultado verdadeiro apenas se:
& - Se ambos os bits forem verdadeiros, retorna verdadeiro;
| - Se um bit for verdadeiro retorna verdadeiro;
^ - Se um bit for falso e outro verdadeiro, retorna verdadeiro;

- Exemplificação:

binários comparados: 0101 1001 e 0011 1100

& - 0001 1000
| - 0111 1100
^ - 0110 0101

Obs.: Para saber qual o valor binário de um determinado número, abra sua calculadora, clique
nas 3 barrinhas no canto superior esquerdo e clique em "Programador", ao digitar o valor, o código
binário desse valor aparecerá como "BIN".
Obs².: Em binário, os bits são contados da direita para a esquerda:


- Exemplificação de uso abaixo:
*/

        Scanner scanner = new Scanner(System.in);

        // O bitecode de mask é 0010 0000
        int mask = 0b100000;
        int n = scanner.nextInt();

        if ((n & mask) != 0) {
            System.out.println("O sexto bit é verdadeiro!");
        }
        else {
            System.out.println("O sexto bit é falso!");
        }
    }
}
