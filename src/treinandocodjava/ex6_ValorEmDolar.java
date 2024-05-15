package treinandocodjava;

public class ex6_ValorEmDolar {
    public static void main(String[] args) {
        double taxaDeConversao = 4.94;
        double valorEmDolares = 100.50;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: "+ valorEmReais);

    }
}
