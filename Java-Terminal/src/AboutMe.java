import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanear = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanear.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanear.next();

        System.out.println("Digite sua idade");
        int idade = scanear.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanear.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}