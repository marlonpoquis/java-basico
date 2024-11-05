import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.println("Digite os dois dígitos da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Agora, digite o seu saldo: ");
        double saldo = scanner.nextDouble();



        System.out.println("Ola, "+nomeCliente+ "." +" Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +"," + " conta "+ numero + " e seu saldo R$ " + saldo+ " já está disponível para saque.");
    }
}



  
/*int numero;
String agencia;
String agenciaClinte;
double decimal;
/* */
