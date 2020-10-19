package com.pbo;

class mahasiswa2{
    //data member
    String nama;
    String NIM;

    //construktor
    mahasiswa2(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }
        //Method tanpa return dan tanpa parameter
        void show(){
            System.out.println("nama : " + this.nama);
            System.out.println("NIM : " + this.NIM);
        }

        //Method tanpa return dan dengan parameter
        void setNama(String nama){
            this.nama = nama;
        }

        //method dengan return tapi tidak ada parameter
        String getNama(){
            return this.nama;
        }
        String getNIM(){
            return this.NIM;
        }

        //method dengan return dan parameter
        String sayHai(String message){
            return message + " juga, nama saya adalah " + this.nama;
        }
    }

public class method {

    public static void main(String[] args) {
        mahasiswa2 mahasiswa1 = new mahasiswa2("ucup", "133005041");
        //method
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHai("ganteng");
        System.out.println(data);
    }
}
