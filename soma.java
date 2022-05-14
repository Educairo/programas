import javax.swing.JOptionPane;
public class Soma{
    public static void main (String [] args){
        int numero1;
        int numero2;
        int resultadoSoma;
        int resultadoSub;
        int resultadoMult;
        int resultadoDiv;

        numero1= Integer.parseInt(JOptionPane.showInputDialog ("Digite o primeiro valor"));

        numero2= Integer.parseInt(JOptionPane.showInputDialog ("Digite o segundo valor"));

        resultadoSoma = numero1 + numero2;

        resultadoSub = numero1 - numero2;

        resultadoMult = numero1 * numero2;

        resultadoDiv = numero1 / numero2;

        JOptionPane.showMessageDialog(null,"O resultado da Soma é " + resultadoSoma);

        JOptionPane.showMessageDialog(null,"O resultado da Subtração é " + resultadoSub);

        JOptionPane.showMessageDialog(null,"O resultado da Multiplicação é "+ resultadoMult);

        JOptionPane.showMessageDialog(null,"O resultado da Divisão é "+ resultadoDiv);
    }
}