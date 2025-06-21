import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoConta);

        scanner.close();
    }
}
