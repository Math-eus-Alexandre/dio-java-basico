import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
    System.out.println("Digite seu nome: ");
    String nome_cliente = scanner.next();

    System.out.println("Digite sua agência: ");
    String agencia = scanner.next();

    System.out.println("Digite seu número de conta: ");
    int numero = scanner.nextInt();

    System.out.println("Digite seu saldo: ");
    float saldo = scanner.nextFloat();

    System.out.println("Olá " + nome_cliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + 
        " e seu saldo " + saldo + 
        " já está disponível para saque.");
        
    }
}
