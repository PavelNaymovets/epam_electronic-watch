package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hh = seconds/3600;
        int mm = (seconds - (hh*3600))/60;
        int ss = seconds - ((hh*3600) + (mm*60));
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
