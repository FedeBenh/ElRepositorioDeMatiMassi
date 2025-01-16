/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Álvaro
 */
public class ClasesTime {
    public LocalTime generarHora() {
        int horas = (int) (Math.random() * (23 - 0 + 1)) + 0;
        int minutos = (int) (Math.random() * (59 - 0 + 1)) + 0;
        int segundos = (int) (Math.random() * (59 - 0 + 1)) + 0;
        // LocalTime miHora = LocalTime.now(); Dar la hora actual
        return LocalTime.of(horas, minutos, segundos);
    }

    public LocalDate generarFecha() {

        int year = (int) (Math.random() * (2023 - 0 + 1)) + 0;
        int month = (int) (Math.random() * (12 - 1 + 1)) + 1;
        int day;

        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            day = (int) (Math.random() * (31 - 1 + 1)) + 1;
        } else if (month == 2) {

            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                day = (int) (Math.random() * (29 - 1 + 1)) + 1;
            } else {
                day = (int) (Math.random() * (28 - 1 + 1)) + 1;
            }

        } else {
            day = (int) (Math.random() * (30 - 1 + 1)) + 1;
        }

        return LocalDate.of(year, month, day);
    }

    public LocalDateTime generarFechaHora(LocalDate LocalDate1, LocalTime LocalTime1) {

        return LocalDateTime.of(LocalDate1.getYear(), LocalDate1.getMonth(), LocalDate1.getDayOfMonth(), LocalTime1.getHour(), LocalTime1.getMinute(), LocalTime1.getSecond());
    }

    public LocalDate devolverPrimeraFecha(LocalDate LocalDate1, LocalDate LocalDate2, LocalDate LocalDate3) {

        if ((LocalDate1.getYear() < LocalDate2.getYear()) && (LocalDate1.getYear() < LocalDate3.getYear())) {
            return LocalDate1;
        } else if ((LocalDate2.getYear() < LocalDate1.getYear()) && (LocalDate2.getYear() < LocalDate3.getYear())) {
            return LocalDate2;
        } else if ((LocalDate3.getYear() < LocalDate1.getYear()) && (LocalDate3.getYear() < LocalDate2.getYear())) {
            return LocalDate3;
        } else if ((LocalDate1.getMonthValue() < LocalDate2.getMonthValue()) && (LocalDate1.getMonthValue() < LocalDate3.getMonthValue())) {
            return LocalDate1;
        } else if ((LocalDate2.getMonthValue() < LocalDate1.getMonthValue()) && (LocalDate2.getMonthValue() < LocalDate3.getMonthValue())) {
            return LocalDate2;
        } else if ((LocalDate3.getMonthValue() < LocalDate1.getMonthValue()) && (LocalDate3.getMonthValue() < LocalDate2.getMonthValue())) {
            return LocalDate3;
        } else if ((LocalDate1.getDayOfMonth() < LocalDate2.getDayOfMonth()) && (LocalDate1.getDayOfMonth() < LocalDate3.getDayOfMonth())) {
            return LocalDate1;
        } else if ((LocalDate2.getDayOfMonth() < LocalDate1.getDayOfMonth()) && (LocalDate2.getDayOfMonth() < LocalDate3.getDayOfMonth())) {
            return LocalDate2;
        } else if ((LocalDate3.getDayOfMonth() < LocalDate1.getDayOfMonth()) && (LocalDate3.getDayOfMonth() < LocalDate2.getDayOfMonth())) {
            return LocalDate3;
        } else {
            System.out.print("Las tres fechas son iguales");
            return LocalDate1;
        }
    }

    public LocalTime devolverUltimaHora(LocalTime LocalTime1, LocalTime LocalTime2, LocalTime LocalTime3) {

        if ((LocalTime1.getHour() > LocalTime2.getHour()) && (LocalTime1.getHour() > LocalTime3.getHour())) {
            return LocalTime1;
        } else if ((LocalTime2.getHour() > LocalTime1.getHour()) && (LocalTime2.getHour() > LocalTime3.getHour())) {
            return LocalTime2;
        } else if ((LocalTime3.getHour() > LocalTime1.getHour()) && (LocalTime3.getHour() > LocalTime2.getHour())) {
            return LocalTime3;
        } else if ((LocalTime1.getMinute() > LocalTime2.getMinute()) && (LocalTime1.getMinute() > LocalTime3.getMinute())) {
            return LocalTime1;
        } else if ((LocalTime2.getMinute() > LocalTime1.getMinute()) && (LocalTime2.getMinute() > LocalTime3.getMinute())) {
            return LocalTime2;
        } else if ((LocalTime3.getMinute() > LocalTime1.getMinute()) && (LocalTime3.getMinute() > LocalTime2.getMinute())) {
            return LocalTime3;
        } else if ((LocalTime1.getSecond() > LocalTime2.getSecond()) && (LocalTime1.getSecond() > LocalTime3.getSecond())) {
            return LocalTime1;
        } else if ((LocalTime2.getSecond() > LocalTime1.getSecond()) && (LocalTime2.getSecond() > LocalTime3.getSecond())) {
            return LocalTime2;
        } else if ((LocalTime3.getSecond() > LocalTime1.getSecond()) && (LocalTime3.getSecond() > LocalTime2.getSecond())) {
            return LocalTime3;
        } else {
            System.out.print("Las tres horas son iguales");
            return LocalTime1;
        }
    }

    public  boolean sonFechasHorasIguales(LocalDateTime LocalDateTime1, LocalDateTime LocalDateTime2, LocalDateTime LocalDateTime3) {
        //Paso las fechas a string y comparo estos
        if (LocalDateTime1.toString().equals(LocalDateTime2.toString()) && LocalDateTime1.toString().equals(LocalDateTime3.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
