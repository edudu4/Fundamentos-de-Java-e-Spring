package collections;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

// Estudos referente a collection Map
// E com fun��es para simular a ideia de obter um dado e transformar em objeto do tipo Usuario.
public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Eduardo");
        usuarios.put(2, "Ana");
        usuarios.put(3, "Pedro");
        usuarios.put(4, "Carlos");
        usuarios.put(5, "Manu");
        usuarios.put(6, "Ricardo");
        usuarios.put(7, "Gabriela");

        System.out.println("--- Lista de Usu�rios ---");
        for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
            System.out.printf("id: %d | nome: %s\n", usuario.getKey(), usuario.getValue());
        }

        System.out.println();
        System.out.println("Lista de id dos Usu�rios: " + usuarios.keySet());
        System.out.println("Lista de nome dos Usu�rios: " + usuarios.values());
        System.out.println("Todas as informa��es dos Usu�rios: " + usuarios.entrySet());
        System.out.println();

        System.out.println("--- Apenas os id ---");
        for (int key : usuarios.keySet()) {
            System.out.print("id: " + key + ", ");
        }
        System.out.println("\n");
        System.out.println("--- Apenas os nomes ---");
        for (String value : usuarios.values()) {
            System.out.println("nome: " + value + ", ");
        }

        System.out.println("\n--- Retorna um usu�rio pesquisado ---");
        Map.Entry<Integer, String> usuario = getUsuarioPorNome(usuarios, "Eduardo");
        System.out.printf("Usu�rio pesquisado: id: %d - nome: %s\n\n", usuario.getKey(), usuario.getValue());


        System.out.println("--- Retorna o �ndice de um usu�rio pesquisado ---");
        Integer indice = getIndiceUsuarioPorNome(usuarios, "Eduardo");
        System.out.printf("Indice desejado: %s", indice > -1 ? indice.toString() : "Indice n�o encontrado");
        System.out.printf("\nUsu�rio recuperado pelo �ndice: id - %d | nome: %s", indice, usuarios.get(indice));
        System.out.println();
    }


    static Integer getIndiceUsuarioPorNome(Map<Integer, String> usuarios, String nome) {
        Integer indice = -1;
        if (usuarios != null && !usuarios.isEmpty() && usuarios.containsValue(nome)) {
            for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
                if (usuario.getValue().equals(nome)) {
                    indice = usuario.getKey();
                    break;
                }
            }
        } else {
            System.out.printf("Usu�rio %s n�o encontrado", nome);
        }
        return indice;
    }

    static Map.Entry<Integer, String> getUsuarioPorNome(Map<Integer, String> usuarios, String nome) {
        Map.Entry<Integer, String> usuarioPesquisado = new AbstractMap.SimpleEntry<>(null, null);
        if (usuarios != null && !usuarios.isEmpty() && usuarios.containsValue(nome)) {
            for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
                if (usuario.getValue().equals(nome)) {
                    usuarioPesquisado = usuario;
                }
            }
        } else {
            System.out.printf("Usu�rio %s n�o encontrado\n", nome);
        }
        return usuarioPesquisado;
    }
}
