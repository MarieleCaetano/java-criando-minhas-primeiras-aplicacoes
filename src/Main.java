public class Main {
    public static void main (String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top gun: Maverick");
        int anoDeLancamento = 2022;
        System.out.println(anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media do filme: " + media);
        System.out.println("Está incluso no plano? " + incluidoNoPlano);
        String sinopse;
        sinopse = "Filme de aventura com Galã dos anos 80";
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media/2); // transforma um float em inteiro
        System.out.println(classificacao);

    }
}