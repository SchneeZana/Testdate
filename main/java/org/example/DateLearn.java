package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateLearn{
    private int Date;

    public DateLearn (int date) {
        Date = date;
    }
    public static void main(String[] args){



    DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

    String formattedDate = formatter.format(LocalDate.now());
System.out.println(formattedDate);
}}
