package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		//Infer�ncia Explicita
		double a = 4.5;
		System.out.println(a);
		
		//Infer�ncia Implicita
		var b = 4.5;
		System.out.println(b);
		
		double c; //Vari�vel foi Declarada
		c = b + 3.5 ; // Inicializada
		System.out.println(c); // Usada!
		
		var d = "Texto";
		System.out.println(d);
		
		d = "Outro Texto";
		System.out.println(d);
		
		var e = false;
		System.out.println(e);
		
	}
}
