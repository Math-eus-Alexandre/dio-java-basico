import java.util.Locale;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) throws Exception {

        Venda venda = new Venda();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor do produto: ");
        Float valorProduto = scanner.nextFloat();
        
        System.out.println("Digite o valor pago: ");
        Float valorPago = scanner.nextFloat();

        venda.calcularTroco(valorProduto, valorPago);
        
        }
    }

