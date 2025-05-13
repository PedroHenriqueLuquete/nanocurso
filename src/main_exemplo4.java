import java.util.Scanner;

public class main_exemplo4 {
    /**
     * implemente um programa que recebe a quantidade de laranjas que
     * o cliente deseja comprar e se o pagamento for por pix ou não (boolean).
     * Caso a quantidade de laranjas seja menor do que 10,
     * o valor de cada laranja será R$2,50. Caso seja maior ou igual a 10,
     * o valor será R$2,00.
     * Se o pagamento for por pix, será adicionado um desconto de 10%
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);



        System.out.println("Quantidade de laranjas:");
        var laranjas= entrada.nextInt();

        System.out.println("A forma de pagamento é PIX? (TRUE ou FALSE)");
        boolean pix= entrada.hasNextBoolean();;

        double valor = laranjas< 10 ? 2.5 : 2;
        double desconto = pix==true ? 0.9 : 1;

        double valorFinal = valor * laranjas * desconto;
        System.out.println("VALOR:" +"R$"+valorFinal);





    }
}
