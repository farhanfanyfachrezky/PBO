package com.tutorial;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static int kalkulasi (int x, int y){
        return x + y;
    }
    static double kalkulasi (double x, double y) {
        return x - y;
    }
    static String kalkulasi (String x, String y){
        String hasil = x + " " + y;

        return hasil;
    }
    static String kalkulasi (String x, int y){
        String hasil = "Nama " + x + " umur " + y + " tahun";
        return hasil;
    }

    public static void main(String[] args) {
	// write your code here
        String nilai3 = kalkulasi("hendi", "hermawan");
        int nilai1 = kalkulasi(8, 5);
        double nilai2 = kalkulasi(4.3, 6.26);
        String nilai4 = kalkulasi("andi", 17);
        System.out.println("Nilai int = " + nilai1);
        System.out.println("Niilai double = " + nilai2);
        System.out.println("Nilai String = " + nilai3);
        System.out.println("Keterangan = " + nilai4);
    }
}
