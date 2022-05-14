import java.util.Scanner;

public class exercicio8 {
    public static void main (Strings [] args){
        //fuly qualified name
        java.util.scanner leitor = 
        new java.util.Scanner (System.in);

        //declaração de variáveis
        int totalEleitores;
        int votosEmBranco;
        int votosNulos;
        int votosValidos;

        double percentualVotosEmBranco;
        double percentualVotosNulos;
        double percentualVotosValidos;
        
        //entrada
        System.out.println("Digite o total de eleitores");
        totalEleitores = leitor.nextint();
        System.out.println("Digite o total de votos em branco");
        votosEmBranco = leitor.nextint();
        System.out.println("Digite o total de votos nulos");
        votosNulos = leitor.nextint();
        System.out.println("Digite o total de votos válidos");
        votosValidos = leitor.nextint();

        //processamento
        percentualVotosEmBranco = votosEmBranco / totalEleitores;
        percentualVotosNulos = votosNulos / totalEleitores;
        percentualVotosValidos = votosValidos / totalEleitores;


        //saída
        System.out.printf ("%.2f%%de votos em branco\n", percentualVotosEmBranco);
        System.out.printf("%.2f%% de votos nulos\n", percentualVotosNulos);
        System.out.printf("%.2f%% de votos válidos\n", percentualVotosValidos);
        
        leitor.close();
      }
    }
     ')
    }
}
