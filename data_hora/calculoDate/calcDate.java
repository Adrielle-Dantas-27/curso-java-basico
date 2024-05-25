package nelio_aulas.data_hora.calculoDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calcDate {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 =Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); //instanciando uma nova data do d04 - 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(8);

        System.out.println("past week " + pastWeekLocalDate);
        System.out.println("next week " + nextWeekLocalDate);
        // ai da pra fazer todos esses tanto com o local date, local date time

        // o instant ele vai sempre ser diferente pq é instante
       Instant pastW = d06.minus(7, ChronoUnit.DAYS);
       Instant nxtW = d06.plus(7, ChronoUnit.DAYS);

       System.out.println(pastW);
       System.out.println(nxtW);

       //calcular duraçoes
       Duration t1 = Duration.between(pastW, nxtW);

       System.out.println("t1: " + t1.toDays());
        // para converte o local darte to time é so colocar .atTime no final do localDate que ele converte. e tb no d04.atTime por ex




    }
}
