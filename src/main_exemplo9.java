public class main_exemplo9 {
    public static void main(String[] args) {

        //Com tipos manifestos

        //PRIMEIRO MODO DE FAZER
        // String escola1="Fiap";
        //        String escola2=new String("Fiap");
        //
        //        {
        //            boolean isEqual=(escola1.equals(escola2));
        //            System.out.println("Igual: "+isEqual);
        //        }


        //SEGUNDO MODO DE FAZER
        String escola1="Fiap";
        String escola2="Fiap";

        {
            boolean isEqual=(escola1==escola2);
            System.out.println("Igual: "+isEqual);
        }

    }
}
