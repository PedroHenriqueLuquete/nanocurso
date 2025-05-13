import java.util.Scanner;

public class main_exemplo3 {
    /**
     * 2-
     * A)para a prova semestral que compõe 50% da média;
     * B)trabalho de conclusão de curso que possui 30%;
     * C) as avaliações intermediárias, que são compostas por duas avaliações
     * durante o semestre e a média dessas das avaliações contribuem com
     * 20% para a média final.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ps=0;
        float tcc=0;
        float av1=0;
        float av2=0;


        System.out.println("Digite a sua nota da ps:");
         ps= entrada.nextFloat();
        System.out.println("Digite a sua nota do tcc:");
        tcc= entrada.nextFloat();
        System.out.println("Digite a sua nota da av1:");
         av1= entrada.nextFloat();
        System.out.println("Digite a sua nota da av2:");
         av2= entrada.nextFloat();


        double mediaFinal= ps * 0.5 + tcc * 0.3 + ((av1+av2)/2) * 0.2;


        System.out.println("A sua média será de:" + mediaFinal);

        if (mediaFinal>=6){
            System.out.println("Aprovado");

        } else if (mediaFinal>=3) {
            System.out.println("Está de exame");

        }else {
            System.out.println("Reprovado");
        }


    }
}
