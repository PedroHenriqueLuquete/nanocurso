/**
 * A classe principal do meu programa
 *
 * @author Pedro Luquete
 * @version 1.0
 * @since  1.0
 *
 */

public class main_exemplo6 {

    /**
     * Este é o metodo que inicia o programa
     * @param args
     */

    public static void main(String[] args) {

        //estou imputando a PRIMEIRA nota
        var nota1=10;
        //estou imputando a SEGUNDA nota
        var nota2=5;
        //A quantidade de notas
        var qtdNotas=2;

        /*
        Para calcular a média, primeiro eu somo as notas e
        depois divido pela quantidade de notas, assim eu tenho o valor da média.
         */

        //Realizando o cálculo
        double media = (nota1+nota2) /qtdNotas;
        //Imprimindo a média
        System.out.println("Média:" + media);




    }
}
