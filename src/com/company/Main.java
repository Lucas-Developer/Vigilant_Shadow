package com.company;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main
{

    public static void Menu()
    {
        System.out.println("1.");
    }

    public static void GetTime()
    {
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Hora atual: " +hour+":"+minute+":"+second);

        if(hour >= 2)
        {
            System.out.println("Horas comparaveis");
        }

        if(hour != 2)
        {
            System.out.println("Não comparaveis");
        }
    }

    public static void main(String[] args)
    {
        GetTime();
    }
}
