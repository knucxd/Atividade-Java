public class exercicio4 {
    Integer i;
    public static void main(String[]agrs) {
        //Essa questão é literalmente impossivel de fazer pq nao tem valor atribuido a variavel i, daí da erro.
        //E só dá erro na linha 11 justamente pelo motivo explicado acima.
        Integer i;
        System.out.println(1 > 2);
        System.out.println(8 == 8);
        System.out.println((12 - 5) > 6);
        System.out.println((0 < 3) && (8 < 9));
        System.out.println((i++) > i); //*
        System.out.println(((10 * 90 / 50 - 2) == 16));
}
}
