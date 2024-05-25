package nelio_aulas.data_hora.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {
        // instanciação de data a partir do agora

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-05-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-05-22T01:30:36");
        Instant d06 = Instant.parse("2024-05-22T01:30:36Z");
        // d07 = Instant.parse("2024-05-22T01:30:36-03:00"); // especificamente o horario de brasilia // n funcionou nessa versao do java

        //formatar data
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("22/05/2024", fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d09 = LocalDate.parse("22/05/2024 1:30", fmt2);

        LocalDate d10 = LocalDate.of(2024, 10, 20);
        LocalDateTime d11 = LocalDateTime.of(2023,27,6,1,30);


        System.out.println(d01); // é como se estivesse chamando um toString. ja ve, pronto
        System.out.println(d02);
        System.out.println(d03); // GMT londres
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
       // System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        
        
    }
}
