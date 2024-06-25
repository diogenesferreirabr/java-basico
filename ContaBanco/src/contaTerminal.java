import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagen conta criada


        System.out.println("ABRINDO UMA CONTA");

        //criando objto Scanner pegar as informacoes
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome : ");
        String nomeCliente = scanner.next();
        //Joao silva

        System.out.println("Digite sua agencia : ");
        int agencia = scanner.nextInt();
        // 065-9

        System.out.println("Digite sua conta : ");
        int numero = scanner.nextInt();
        //2130

        System.out.println("Digite o saldo : ");
        double saldo = scanner.nextDouble();
        //159.60

        //Imprimindo as informações
        System.out.println("Ola " + nomeCliente + " . Obrigado por criar uma conta conosco, sua agencia e " + agencia + ". e a Conta e " + numero + " e o seu saldo e : " + saldo + "  ja esta disponivel para saque!");

        System.out.println("CONTA CRIADA!");


        //modo sem scanner
       // String nomeCliente = args [0];
        //String agencia = args [1];
        //int numero = Integer.valueOf(args[2]);
        //double saldo = Double.valueOf(args[3]);
    }
}
