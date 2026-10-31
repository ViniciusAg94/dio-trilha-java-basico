import java.util.Scanner;
public class Contador {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numeroUm = scan.nextInt();
        System.out.print("Insira outro número inteiro: ");
        int numeroDois = scan.nextInt();
        scan.nextLine();
        scan.close();
            try {
                contarNumeros(numeroUm, numeroDois);

            }
            catch (ParametroInvalidoException e) {
                System.out.println("O primeiro número deve ser menor que o segundo!");
            }
        }
    }
    static void contarNumeros(int numeroUm, int numeroDois) throws ParametroInvalidoException {
        if (numeroUm > numeroDois) {
            throw new ParametroInvalidoException();
        }
        int diferenca = numeroDois - numeroUm;

        for (int i = 0; i < diferenca; i++) {
            System.out.println(i+1);
        }

    }
}
