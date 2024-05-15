package treinandocodjava;

public class Switchcase_dia_da_sem {
    public static void main(String[] args) {
    int dia = 3;
    String nomeDia = switch (dia) {
        case 1 -> "domingo";
        case 2 -> "segunda-feira";
        case 3 -> "terça-feira";
        case 4 -> "quarta-feira";
        case 5 -> "quinta-feira";
        case 6 -> "sexta-feira";
        case 7 -> "sábado";
        default -> "Dia inválido";
    };

        System.out.println("O dia " + dia + " é " + nomeDia);
}}
