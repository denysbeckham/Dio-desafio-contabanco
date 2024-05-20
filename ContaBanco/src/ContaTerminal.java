import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criação do objeto scanner para leitura dos dados digitado pelo usuário
        Scanner entrada = new Scanner(System.in);

        //declaração das variáveis para armazenar os valores digitados pelo usuário
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibição de Leitura para o usuário digitar os dados
        System.out.println("Por favor, digite o número da Conta!");
        numero = entrada.nextInt();

        //limpa o scanner de entrada
        entrada.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = entrada.nextDouble();

        //exibição da mensagem personalizada, de acordo com os dados digitados pelo usuário
        String mensagem = " Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já disponível para saque.";
        System.out.println(mensagem);


        //fechamento do scanner
        entrada.close();
    }
}
