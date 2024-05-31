import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //INICIANDO A CLASSE SCANNER
        Scanner sc = new Scanner(System.in);

        //SOLICITANDO A AGENCIA E INCREMENTANDO A VARIAVEL
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        //SOLICITANDO A CONTA E INCREMENTANDO A VARIAVEL
        System.out.println("Por favor, digite o número da Conta: ");
        int conta = sc.nextInt();

        //SOLICITANDO O NOME COMPLETO E INCREMENTANDO A VARIAVEL
        System.out.println("Por favor, digite o seu nome completo: ");
        String nome = sc.nextLine();

        //SOLICITANDO O SALDO E INCREMENTANDO A VARIAVEL
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = sc.nextDouble();
        
        sc.close();
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
