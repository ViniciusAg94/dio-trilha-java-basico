package candidatura;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ProcessoEntradaUsuario {
    static void main() {
        while (true) {
            try {
                System.out.println("Processo Seletivo DIO Enterprises");
                Scanner scan = new Scanner(System.in);


                System.out.print("Digite Seu Nome: ");
                String nome = scan.nextLine();
                System.out.print("Pretensão salarial: ");
                double salarioCandidato = scan.nextDouble();

                System.out.println("Seja bem-vindo a DIO Enterprises, " + nome.toUpperCase() + "!");
                System.out.println("A situação da sua candidatura está descrita abaixo:");

                analisarCandidato(salarioCandidato);
                scan.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("O campo de pretensão salarial deve ser numérico!");
            }
        }
    }



    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("CONTRATADO! Parabéns!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("NEGOCIAÇÃO SALARIAL! Vamos ligar para mais detalhes!");
        } else {
            System.out.println("AGUARDANDO! Vamos analisar mais candidatos e entraremos em contato!");
        }
    }
}
