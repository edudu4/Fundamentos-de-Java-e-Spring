package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila

        //Diferen�a � o comportanto
        //Quando a fila est� cheia!
        fila.add("Eduardo"); // Lan�a Exce��o
        fila.add("Ana");
        fila.add("Carlos");
        fila.offer("Jo�o");  // Retorna false
        fila.offer("Pedro");
        fila.offer("Manu");

        // Peek e Element -> Pegam elementos na fila sem Remover

        //Diferen�a � o comportanto
        //Quando a fila est� vazia!
        System.out.println("--- Pega sem Remover ---");
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lan�a Exce��o
        System.out.println(fila.element());

        // Poll e Remove -> Pegam elementos na fila e removem

        //Diferen�a � o comportanto
        //Quando a fila est� vazia!
        System.out.println("--- Pega e Remove ---");
        System.out.println(fila.poll()); // Retorna null;
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Lan�a Exce��o
        System.out.println(fila.remove());

    }
}
