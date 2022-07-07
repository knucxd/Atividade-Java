import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        float h, b, B, a;
        System.out.printf("Informe a altura do trapézio: ");
        h = resposta.nextFloat();
        System.out.printf("Informe a base menor: ");
        b = resposta.nextFloat();
        System.out.printf("Informe a base maior: ");
        B = resposta.nextFloat();
        a = (h * (b + B)) / 2;
        System.out.printf("A aréa do trapézio foi de: "+ a);
        resposta.close();
}
}