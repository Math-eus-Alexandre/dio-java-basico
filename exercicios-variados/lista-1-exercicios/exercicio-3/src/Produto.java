/*
Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do
produto consumida calculando o valor final a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Produto {

    public static void calcularValorPagar(Float valorKG, Float quantidadeKG){
        Float valorPagar = valorKG * quantidadeKG;
        System.out.println("Valor a ser pago:" +valorPagar);
    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Float valorKG;
        Float quantidadeKG;

        System.out.println("Digite o valor do quilo ");
        valorKG = scanner.nextFloat();

        System.out.println("Digite a quantidade de quilos");
        quantidadeKG = scanner.nextFloat();

        calcularValorPagar(valorKG, quantidadeKG);

    
    }

}
