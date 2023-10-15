package atividade4;
import javax.swing.JOptionPane;

public class algoritimo1 {
    public static void main(String[] args) {
        int soma = 0;

        do {
            String entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
            int numero1 = Integer.parseInt(entrada);

            entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
            int numero2 = Integer.parseInt(entrada);

            soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);

            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

        System.exit(0);
    }
}
