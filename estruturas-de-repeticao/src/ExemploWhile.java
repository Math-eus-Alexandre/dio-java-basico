import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0)
        {
            Double valorDoce = ValorAleatório();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor "+valorDoce+" Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    private static Double ValorAleatório() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
