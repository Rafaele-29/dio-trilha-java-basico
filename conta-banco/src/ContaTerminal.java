import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o numero da conta!");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o valor para saque!");
        double saldo = scanner.nextDouble();

        System.out.format("Olá" + nomeCliente);
        System.out.format("obrigado por criar uma conta em nosso banco, sua agência é," + agencia);
        System.out.format("conta" + numeroDaConta);
        System.out.format("e seu saldo" + saldo);
        System.out.println("já está disponivel para saque.");

    }
}