package vetornomes;
import java.util.Scanner;
public class VetorNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // comece o seu código aqui
        /* Enunciado : crie um programa que armazene cinco nomes.
                       Ao final liste os nomes na horizontal separados por um hifen.
        */
        String[] vetNomes  = new String[5];
        Double[] vetMedias = new Double[5];
        String[] vetSituacao = new String[5];
        
        //Entrada de dados
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um nome : ");
            vetNomes[i] = sc.next();            
            System.out.print("Informe a media do aluno : ");
            vetMedias[i] = sc.nextDouble();
            // se media >= 7 "APROVADO" senão "REPROVADO"
            if (vetMedias[i] >= 7) {
                vetSituacao[i] = "APROVADO";
            } else {
                vetSituacao[i] = "REPROVADO";
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
        for (int pos = 0; pos< 5; pos++) {
            System.out.println("Aluno...: " + vetNomes[pos]);
            System.out.println("Media...: " + vetMedias[pos]);
            System.out.println("Situacao: " + vetSituacao[pos]);
            System.out.println("-----------------------------------");
        }
        System.out.println("");        
        sc.close();
    }

}
