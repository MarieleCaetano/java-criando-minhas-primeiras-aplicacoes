package treinandocodjava;

public class ConvertendoDouble_exDois {
    public static void main(String[] args) {
        int valordamarmita = 20;
        double valordacoca = 9.58;
        int valordacocainteiro = (int) valordacoca;

        System.out.printf("""
                    O valor da coca é: %f, valor da marmita é: %d, mas se
                    arredondarmos o valor da coca, fica %d
                %n""",valordacoca, valordamarmita, valordacocainteiro);
    }
}
