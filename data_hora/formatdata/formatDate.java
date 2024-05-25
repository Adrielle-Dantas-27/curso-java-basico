package nelio_aulas.data_hora.formatdata;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatDate {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 =Instant.parse("2022-07-20T01:30:26Z");
         
      

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // o withzone especifica qual formato vou usar 
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // ele pega o fuso do computador do usuario

        // usando os formatos predefinidos java em vez do ofPattern
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println(d04.format(fmt1)); // rwespeita o formato criado
        System.out.println(d05.format(fmt2));
        System.out.println(fmt3.format(d06));
        System.out.println(d05.format(fmt4)); // N FUNCIONA COM ISNTANT PQ O INSTANT EH UMA DATA LOCAL, NAO DA PRA FORMATAR sem informar o fuso horario
        System.out.println(fmt5.format(d06));

        // o instant n em o format. ele nao está em uma data local, ele está numa data ambigua
       

    }
}
