package vetornomes;
import java.util.Scanner;
public class VetorNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // comece o seu código aqui
        /* Enunciado : crie um programa que armazene cinco nomes.
                       Ao final liste os nomes na horizontal separados por um hifen.
        */
        String[] vetNomes       = new String[5];
        Double[] vetMedias      = new Double[5];
        String[] vetSituacao    = new String[5];
        String[] vetResponsavel = new String[5];
        Double[][] matNotas     = new Double[5][4];
        
        //Entrada de dados
        
        for (int lin = 0; lin < 5; lin++) {
            System.out.print("Informe um nome : ");
            vetNomes[lin] = sc.next();            
            System.out.print("Informe o responsavel : ");
            vetResponsavel[lin] = sc.next();
            System.out.print("Informe a media do aluno : ");
            vetMedias[lin] = sc.nextDouble();
            // matriz de notas
            for (int col = 0; col < 4; col++) {
                System.out.println("Informe a nota nr " + (col+1) +
                                   " do " + vetNomes[lin]);
                matNotas[lin][col] = sc.nextDouble();
            }            
            
            // se media >= 7 "APROVADO" senão "REPROVADO"
            if (vetMedias[lin] >= 7) {
                vetSituacao[lin] = "APROVADO";
            } else {
                vetSituacao[lin] = "REPROVADO";
            }
        }

        //Saida de dados
        /*
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
            System.out.print(vetNomes[i] + " - ");
            System.out.print(vetMedias[i] + " - ");
        } else {
            System.out.print(vetNomes[i] + " - ");
            System.out.print(vetMedias[i]);
            }
        }
        */  
        for (int lin = 0; lin < 5; lin++) {
            System.out.println("Aluno.......: " + vetNomes[lin]);
            System.out.println("Responsavel.: " + vetResponsavel[lin]);
            System.out.println("Media.......: " + vetMedias[lin]);
            System.out.println("Situacao....: " + vetSituacao[lin]);
            System.out.print  ("Notas ......: ");
            for (int col = 0; col < 4; col++) {
                System.out.print(matNotas[lin][col] + " - ");
            }
            System.out.println("\n-----------------------------------");
        }
        System.out.println("");        
        sc.close();
    }

}
