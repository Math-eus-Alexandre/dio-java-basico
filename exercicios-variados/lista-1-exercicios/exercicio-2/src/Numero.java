import java.util.Locale;
import java.util.Scanner;

public class Numero {

    public static void main(String[] args) throws Exception {

        Operador operador = new Operador();
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        
        operador.calcularMetade(num);
    }
}
