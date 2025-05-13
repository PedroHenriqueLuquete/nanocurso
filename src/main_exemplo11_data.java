import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main_exemplo11_data {

    public static void main(String[] args) {

        System.out.println("Hoje: "
        + LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));



    }
}
