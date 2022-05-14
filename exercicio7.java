import java.util.Scanner;
public class exercicio7{
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        //declaração de variáveis
        int anos, meses, dias;
        int resultado;
        //entrada
        System.out.println("Digite a quantidade de anos");
        anos = leitor.nextInt();
        System.out.println("Digite a quantidade de meses");
        meses = leitor.nextInt();
        System.out.println("Digite a quantidade de dias");
        dias = leitor.nextInt();
        //processamento
        resultado = anos * 365 + meses * 30 + dias;
        
        //saída
        System.out.printf(" A sua idade em dias é: %d", resultado);
        
        
        leitor.close();







    }
}
