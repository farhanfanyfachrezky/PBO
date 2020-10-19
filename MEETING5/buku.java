package com.pbo;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void dislay(){
        System.out.println("\njudul\t: " + this.judul);
        System.out.println("\npenulis\t: " + this.penulis);
    }
}
public class buku {
    public static void main(String[] args){
        Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        buku1.dislay();

        //menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        //assignment object
        Buku buku2 = buku1;
        buku2.dislay();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));

        //karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku2.judul = "Membunuh komandantur";
        buku1.dislay();
        buku2.dislay();

        //kita akan memasukkan object kedalam methods
        fungsi(buku2);
        buku1.dislay();
        buku2.dislay();
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}
