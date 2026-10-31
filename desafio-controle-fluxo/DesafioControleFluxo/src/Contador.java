//importando a classe Scanner;
import java.util.Scanner;
public class Contador {
    static void main() {
        //criando o objeto scanner com o nome "scan";
        Scanner scan = new Scanner(System.in);
        //pedindo as entradas do usuário;
        System.out.print("Insira um número inteiro: ");
        int numeroUm = scan.nextInt();
        System.out.print("Insira outro número inteiro: ");
        int numeroDois = scan.nextInt();
        scan.nextLine();
        scan.close();
        //criando tratamento de excessão;
            try {
                contarNumeros(numeroUm, numeroDois);

            }//disparando a excessão;
            catch (ParametroInvalidoException e) {
                System.out.println("O primeiro número deve ser menor que o segundo!");
            }
        }
        //metodo que recebe as entradas do usuário, subtrai a diferença, e imprime a iteração dessa
        //diferença no terminal;
    static void contarNumeros(int numeroUm, int numeroDois) throws ParametroInvalidoException {
        if (numeroUm > numeroDois) {
            throw new ParametroInvalidoException();
        }
        int diferenca = numeroDois - numeroUm;
        //laço que itera sobre a diferença entre as duas entradas;
        for (int i = 0; i < diferenca; i++) {
            System.out.println(i+1);
        }

    }

}



