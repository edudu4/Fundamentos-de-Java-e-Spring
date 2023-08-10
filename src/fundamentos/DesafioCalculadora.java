package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        String valor = JOptionPane.showInputDialog("Digite o primeiro n�mero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero");
        String operador = JOptionPane.showInputDialog("Digite o operador");

        double numero = Double.parseDouble(valor);
        double numero2 = Double.parseDouble(valor2);
        operador = operador.trim();
        double resultado = 0;

        switch (operador) {
            case "+" -> resultado = numero + numero2;
            case "-" -> resultado = numero - numero2;
            case "*" -> resultado = numero * numero2;
            case "/" -> resultado = numero / numero2;
            case "%" -> resultado = numero % numero2;
            default ->{
                System.out.println("Operador inv�lido.");
                System.exit(0);
            }
        }

//		double resultado = operador.equals("+") ? numero + numero2 : 0;
//		resultado = operador.equals("-") ? numero - numero2 : resultado;
//		resultado = operador.equals("*") ? numero * numero2 : resultado;
//		resultado = operador.equals("/") ? numero / numero2 : resultado;
//		resultado = operador.equals("%") ? numero % numero2 : resultado;
//
        System.out.printf("%.2f %s %.2f = %.2f", numero, operador, numero2, resultado);

    }
}
