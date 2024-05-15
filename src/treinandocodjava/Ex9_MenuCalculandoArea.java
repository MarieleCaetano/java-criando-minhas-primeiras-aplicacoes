package treinandocodjava;

import java.util.Scanner;

public class Ex9_MenuCalculandoArea {
    public static void main(String[] args) {
        Scanner escolhadousuarios = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Digite 1, para calcular a area do quadrado, ou digite 2, para calcular a area do circulo");
            System.out.println("Ou digite 3 para sair");
            escolha = escolhadousuarios.nextInt();
            if (escolha == 2) {
                    System.out.println("Escreva o valor do raio: ");
                    int valor;
                    valor = escolhadousuarios.nextInt();
                    double area = Math.PI * valor * valor;
                    System.out.println("A área do circulo informado é: " + area);
            }
            else if (escolha == 1) {
                System.out.println("Digite a medida do LADO do quadrado em cm:");
                double ladoQuadrado = escolhadousuarios.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                String mensagem = "A area do quadrado informado é: ";
                System.out.println(mensagem + areaQuadrado);
            }
            else {
                System.out.println("Programa encerrado!");
            }
        }
    }
}
