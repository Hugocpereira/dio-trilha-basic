import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        double saldo;
        int numeroConta;
        String agencia;

        System.out.println("Sistema Bancáio Teste Dio");
        System.out.println("----------------------");
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Número da Agência: ");
        agencia = sc.next();
        System.out.println("Número da Conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}