public class exercicio1_nanocurso {
/**
 * 1-
 *7 na prova semestral
 * 5 no trabalho de conclusão
 * 10 e 6 como média nas avaliações intermediárias.
 */

    /**
     * 2-
     * A)para a prova semestral que compõe 50% da média;
     * B)trabalho de conclusão de curso que possui 30%;
     * C) as avaliações intermediárias, que são compostas por duas avaliações
     * durante o semestre e a média dessas das avaliações contribuem com
     * 20% para a média final.
     */
    public static void main(String[] args) {
        int ps=7, tcc=5, av1=10, av2=6;

        double mediaFinal= ps * 0.5 + tcc * 0.3 + ((av1+av2)/2) * 0.2;

        System.out.println("A sua média será de:" + mediaFinal);

















    }
}
