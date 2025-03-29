//Leia o valor do produto e adicione mais 15% de imposto. Escreva o preço final do produto.

import java.util.Locale;
import java.util.Scanner;

public class Produto {

    public static void calculaImposto(Double valorProduto){
        Double valorFinal = valorProduto * 0.15 + valorProduto;
        System.out.println("\nValor do produto + 15% de imposto: "+valorFinal);
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nDigite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Produto.calculaImposto(valorProduto);
    }
}
