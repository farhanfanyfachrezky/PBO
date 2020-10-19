package com.pbo;

//class tanpa construktor atau class polos

class polos {
    String datastring;
    int datainteger;
}

//class dengan construktor
class mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    //construktor dipanggil saat objek pertama kali dibuat
    //mahasiswa();
    //      system.out.println("ini adalah construktor")
    // }

    // construktor dengan perimeter
    mahasiswa(String inputnama, String inputNIM, String inputjurusan) {
        nama = inputnama;
        NIM = inputNIM;
        jurusan = inputjurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class contrukstor {

    public static void main(String[] args) throws Exception {
        mahasiswa mahasiswa1 = new mahasiswa("ucup","13305041","Teknik perteknikan");
        mahasiswa mahasiswa2 = new mahasiswa("otong","13305042","teknik pertambangan");

        //polos objekpolos = new polos();
        //objectpolos.dataString = "polos";
        //objectpolos.dataInteger= 0;

        //System.out.Println(objectpolos.dataString);
        //System.out.Println(objectpolos.dataInteger);


    }
}
