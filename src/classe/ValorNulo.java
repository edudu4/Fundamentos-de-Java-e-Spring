package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

//        Erro de compila��o, pois est� tentando acessar uma vari�vel local n�o inicializada
//        int a;
//        System.out.println(a);
//
//        Erro em tempo de execu��o, pois est� tentando acessar um valor nulo sem apontamento
//        Data d1 = null;
//        d1.mes = 3;
//        String s2 = null;
//        System.out.println(s2.concat("????"));
    }
}
