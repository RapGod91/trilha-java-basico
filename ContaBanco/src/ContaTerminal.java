import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner lerInfo = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = lerInfo.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = lerInfo.next();

        lerInfo.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = lerInfo.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = lerInfo.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }

}
