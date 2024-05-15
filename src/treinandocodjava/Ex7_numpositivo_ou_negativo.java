package treinandocodjava;

import java.util.Scanner;

public class Ex7_numpositivo_ou_negativo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numerodigitado = 0;
        System.out.println("Digite um numero: ");
        int inicio = 0;
        while (true){
            numerodigitado = numero.nextInt();

            if (numerodigitado < inicio) {
                System.out.println("Numero negativo");
                break;
            }
            else if (numerodigitado > inicio || numerodigitado == inicio) {
                System.out.println("Numero positivo");
                break;
            }
    }
}}
