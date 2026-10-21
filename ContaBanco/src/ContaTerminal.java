import java.util.Scanner;
//Nome da classe
/**
 *Aplicação para criação de conta em banco
 * ContaBanco
 */
public class ContaTerminal {
    //Declaração do método
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Chamando a classe Scanner

        System.out.println("------DIO UNITED BANK------");
        
        //Informações sobre o usuário:
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeCliente = sc.nextLine().toUpperCase();
        System.out.print("Valor a depositar: R$");
        double saldo = sc.nextDouble();

        sc.close();//fechando o Scanner
        
        //Imprimindo as informações no terminal
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta na DIO UNITED BANK!");
        System.out.println("sua AGÊNCIA é " + agencia + ", CONTA " + numero); 
        System.out.println("e seu SALDO de R$" + saldo + " já está disponível para saque!");
        System.out.println("TENHA UM ÓTIMO DIA!");


    
    }
}
