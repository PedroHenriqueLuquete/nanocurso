public class main_exemplos {
    public static void main(String[] args) {

        //E->&&
        var media =7;
        var presenca=60;
        boolean passouAno=media>=6&&presenca>75;
        System.out.println(passouAno);

        //OU->||
        var idade=65;
        boolean gratuito=idade<5||idade>65;
        System.out.println(gratuito);


        //Negação->Invertendo o resultado booleano
        boolean podeDirigir=!(idade<18);
        System.out.println(podeDirigir);







    }
}
