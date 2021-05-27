package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hh = (seconds/3600)-(24*((seconds/3600)/24));
        int mm = (seconds - ((seconds/3600)*3600))/60;
        int ss = seconds - (((seconds/3600)*3600) + (mm*60));
        System.out.println(hh + ":" + ((mm < 10) & (ss < 10)? "0" + mm + ":" + "0" + ss : (mm > 9) & (ss > 9)? mm + ":" + ss : (mm > 9) & (ss < 10)? mm + ":" + "0" + ss : "0" + mm + ":"  + ss));
    }
}
