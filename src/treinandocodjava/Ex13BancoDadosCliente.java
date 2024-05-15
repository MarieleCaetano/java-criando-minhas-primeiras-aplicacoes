package treinandocodjava;

import java.util.Scanner;

public class Ex13BancoDadosCliente {
    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("\n ~Dados do cliente~ ");
        System.out.println("\n Nome: Maria Gonçalves teixeira");
        System.out.println("Tipo de conta: Corrente");
        double saldo = 2500;
        System.out.println("Saldo inicial da conta: " + saldo);
        System.out.println("\n ****************************");
        System.out.println("\n **OPERAÇÕES DISPONÍVEIS** ");
        int opcaodesejada = 0;
        double valor_a_ser_adicionado = 0;
        double valor_a_ser_transferido = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcaodesejada = scanner.nextInt();
            if (opcaodesejada == 4) {
                System.out.println("Encerrando... Volte sempre");
                break;
            }
            else if (opcaodesejada == 1) {
                System.out.println("Seu saldo em conta é: " + saldo);
                System.out.println("-----------------------");
            }
            else if (opcaodesejada == 2) {
                System.out.println("Digite o valor a ser depositado:");
                valor_a_ser_adicionado += scanner.nextDouble();
                saldo += valor_a_ser_adicionado;
                System.out.println("Saldo atualizado: " + saldo);
            }
            else if (opcaodesejada == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                valor_a_ser_transferido = scanner.nextDouble();
                if (valor_a_ser_transferido <= saldo) {
                    saldo -= valor_a_ser_transferido;
                    System.out.println("Saldo atualizado: " + saldo);
                }
                else {
                    System.out.println("Saldo insuficiente para transferência");
                }
            }


        }
    }
}
