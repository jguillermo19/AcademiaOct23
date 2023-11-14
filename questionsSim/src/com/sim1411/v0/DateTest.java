package com.sim1411.v0;

import java.time.*;
import java.time.format.*;

public class DateTest {
    public static void main(String[] args) { 
        // Incluir la hora en el string
        LocalDateTime greatDay = 
        		LocalDateTime.parse("2015-01-01T12:00:00");
        String greatDayStr = 
        		greatDay.format(DateTimeFormatter.ISO_DATE_TIME); 
        System.out.println(greatDayStr);
    } 
}
