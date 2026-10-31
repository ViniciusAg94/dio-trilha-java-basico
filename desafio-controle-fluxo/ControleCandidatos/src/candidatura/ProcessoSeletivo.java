package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    //metodo principal que retorna todos os valores e parâmetros;
    static void main() {
        System.out.println("Processo Seletivo DIO Enterprises");
        selecaoCandidatos();
        String[] aprovados = selecaoCandidatos();
       for (String candidato: aprovados) {
           if (candidato != null) {
               ligarCandidato(candidato);
           }

       }

    }
    //metodo que cria o array com os nomes dos candidatos
    static String[] selecaoCandidatos() {
        String [] candidatos = {"Carlos", "Beatriz", "Bruno", "Cesar", "Vinicius", "Ana", "Fernanda", "Murilo", "Vicente", "Bento"};
        String [] selecionados = new String[5];
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        //laço que itera sobre os candidatos selecionados conforme a pretensão salarial
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            String salarioFormatado = String.format("R$ %.2f", salarioPretendido);
            System.out.println("O candidato " + candidato + " Solicitou o valor  " + salarioFormatado  + " de salário.");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        imprimirSelecionados(selecionados, candidatosSelecionados);
        return selecionados;
    }

    //metodo que retorna de forma randomica a pretensão salarial para cada candidato
    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    //metodo que analisa cada candidato com base na pretensão salarial
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
    //metodo que mostra no terminal os candidatos selecionados
    static void imprimirSelecionados(String[] selecionados, int totalSelecionados) {

        for (int i = 0; i < totalSelecionados; i++) {
            System.out.println("Candidato número " + (i+1) + ": " + selecionados[i]);
        }
    }
    //metodo que retorna o numero de tentativas de ligação
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    //metodo que tenta ligar para cada candidato
    static void ligarCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentanto = !atendeu;
            if (continuarTentanto) {
                tentativasRealizadas++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        }while(continuarTentanto && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com o(a) candidato(a) " + candidato + " na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o(a) candidato(a) " + candidato + ", numero máximo de tentativas realizadas!" );
        }
    }
}
