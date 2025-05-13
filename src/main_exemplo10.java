import java.time.LocalDate;

public class main_exemplo10 {
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println("Dia da semana (nome): "+ localDate.getDayOfWeek().name());
        System.out.println("Dia da semana (ordinal): "+ localDate.getDayOfWeek().ordinal());
        System.out.println("Mês (nome): "+ localDate.getMonthValue());
        System.out.println("Mês (ordinal): "+ localDate.getMonth().name());
        System.out.println("Ano: "+ localDate.getYear());
        System.out.println("Ano Bissexto: "+ localDate.isLeapYear());
        System.out.println("Número de dias do Mês: "+ localDate.lengthOfMonth());
        System.out.println("Número de dias do ano: "+ localDate.lengthOfYear());

    }
}