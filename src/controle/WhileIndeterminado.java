package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operacao = "";

        System.out.println("Digite a opera��o quee deseja: ");
        while (!operacao.equalsIgnoreCase("sair")){
            System.out.println("1 - Ol� Mundo!, 2 - Bom dia!, Sair");
            operacao = entrada.next();
            if (operacao.equalsIgnoreCase("1")) {
                System.out.println("Ol� Mundo!");
            } else if (operacao.equalsIgnoreCase("2")) {
                System.out.println("Bom dia!");
            } else {
                System.out.println();
            }
        }
        entrada.close();
    }
}