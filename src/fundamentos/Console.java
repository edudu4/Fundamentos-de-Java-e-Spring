package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia!\n");
		
		System.out.printf("Nome: %s %n", "Eduardo");
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio: R$%.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		//System.out.print("\nNome: ".concat(nome).concat(" ").concat(sobrenome));
		
		System.out.printf("%n%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
	}
}