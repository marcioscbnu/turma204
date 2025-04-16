package vetortamanhodinamico;

import java.util.Scanner;

public class VetorTamanhoDinamico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetNomes;
        char fimProg = 'N';

        while (fimProg == 'N') {
            System.out.println("Informe a qtde de alunos");
            var qtdAlunos = sc.nextInt();

            vetNomes = new String[qtdAlunos];

            for (int i = 0; i < qtdAlunos; i++) {
                System.out.println("Informe o nome nr " + (i+1));
                vetNomes[i] = sc.next();
            }
            for (int i = 0; i < qtdAlunos; i++) {
                System.out.print(vetNomes[i] + " - ");
            }
            System.out.println("Finaliza? (S/N)");
            fimProg = sc.next().toUpperCase().charAt(0);
        }
        // termine seu codigo aqui
        sc.close();
    }

}
