package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero ");
		
		System.out.println(valor1 + valor2);
		
		long numero1 = Long.parseLong(valor1);
		long numero2 = Long.parseLong(valor2);
		
		long soma = numero1+numero2;
		//double media = (numero1+numero2)/2; -> Resultado diferente, por conta da convers�o impl�cita
		double media = (double)(numero1+numero2)/2;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + media);
	}
}
