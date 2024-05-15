package treinandocodjava;

import java.util.Random;
import java.util.Scanner;

public class Ex5JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numerosorteado = new Random().nextInt(100);
        Scanner tentativa = new Scanner(System.in);
        int resposta = 0;

        for (int quantidade_de_tentativas = 0; quantidade_de_tentativas <= 4; quantidade_de_tentativas++) {
            System.out.println(" Digite um numero: ");
            resposta = tentativa.nextInt();
            if (resposta == numerosorteado) {
                System.out.println("Parabéns! você acertou!!!");
            }
            else if (resposta < numerosorteado) {
                System.out.println("Errado, tente um numero maior");
            }
            else if (quantidade_de_tentativas == 4) {
                System.out.println("Quantidade de tentativas esgotadas, tente novamente");
            }
            else {
                System.out.println("Errado, tente um numero menor");
            }

        }
    }

    private static void elif(boolean b) {
    }
}
