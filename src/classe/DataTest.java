package classe;

public class DataTest {
    public static void main(String[] args) {
        Data dataHoje = new Data();
        dataHoje.dia = 27;
        dataHoje.mes = 7;
        dataHoje.ano = 2023;
        String dataHojeFormatada = dataHoje.obterDataFormatada();

        Data dataEsperada = new Data(23,8,2023);
        String dataEsperadaFormatada = dataEsperada.obterDataFormatada(6);

        Data dataUnix = new Data();
        String dataUnixFormatada = dataUnix.obterDataFormatada();

        System.out.printf("Hoje � dia %s\n", dataHojeFormatada);
        System.out.printf("Planejo concluir o curso na data %s\n", dataEsperadaFormatada);
        System.out.printf("A era Unix que come�ou em %s � um marco para a computa��o.", dataUnixFormatada);
    }
}
