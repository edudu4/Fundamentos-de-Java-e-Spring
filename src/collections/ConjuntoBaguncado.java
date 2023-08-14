package collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Convers�o autom�tica - double -> Double, int -> Integer, etc...
        conjunto.add(1.2);
        conjunto.add(5);
        conjunto.add(true);
        conjunto.add("oi");
        conjunto.add('e');


        // N�o aceita repeti��o
        System.out.println(conjunto.size());
        conjunto.add("oi");
        conjunto.add(1.2);
        System.out.println(conjunto.size());

        // Remove e retorna true ou false
        System.out.println(conjunto.remove("e"));
        System.out.println(conjunto.remove('e'));
        System.out.println(conjunto.size());

        // Verifica se cont�m no conjunto e retorna true ou false
        System.out.println(conjunto.contains('e'));
        System.out.println(conjunto.contains(5));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);

        //nums.addAll(conjunto); Uni�o entre dois conjuntos
        nums.retainAll(conjunto); // Intersec��o entre dois conjuntos - resta apenas os valores em comum
        System.out.println(nums);

        System.out.println(conjunto);
    }
}
