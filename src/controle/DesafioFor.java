package controle;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for (; !valor.equals("######"); valor += "#"){
            System.out.println(valor);
        }
        // Vers�o do desafio
        // N�o pode usar valor num�rico para controlar o la�o!
    }
}
