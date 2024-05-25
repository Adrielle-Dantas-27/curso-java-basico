package nelio_aulas.data_hora.globalToLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class globalToLocal {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 =Instant.parse("2022-07-20T01:30:26Z");
       
      //  LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // pelo visrto nao estapegando nessa versao do java


        //fornece os nomes dos fusos personalizados
    //    for(String s :ZoneId.getAvailableZoneIds()) {
    //     System.out.println(s);
    //    }

    System.out.println(d04.getDayOfMonth());

      


    }
}
