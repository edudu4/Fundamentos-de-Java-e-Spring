package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhor");
		s = s.toUpperCase();
		s = s.concat("!!");
		
		System.out.println(s);
		
		String x = "Eduardo".toUpperCase();
		System.out.println(x);
		
		String y = "Boa noite X"
				.replace("X", "Edu")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
