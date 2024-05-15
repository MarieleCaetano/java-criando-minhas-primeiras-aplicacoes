package treinandocodjava;

import java.util.Scanner;

public class Ex8_comparacaodeNumeros {
    public static void main(String[] args) {
        Scanner opcoes = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int opcao1 = opcoes.nextInt();
        System.out.println("Digite o segundo numero: ");
        int opcao2 = opcoes.nextInt();

        if (opcao1 == opcao2) {
            System.out.println("Os dois numeros digitados são iguais");
        }
        else if (opcao1 > opcao2) {
            System.out.println("A opção 1: " + opcao1 + " É maior que a opção 2: " + opcao2);
        }
        else {
            System.out.println("A opção 2: " + opcao2 + " É maior que a opção 1: " + opcao1);
        }

    }
}
