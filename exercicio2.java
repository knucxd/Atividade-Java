import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        float a;
        System.out.printf("Informe o valor exato da área: ");
        a = resposta.nextFloat();
        System.out.println("O valor arredondado da área foi de: " +Math.round(a));
        resposta.close();
} 
}
