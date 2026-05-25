package Praktikum.Pertemuan6;

import Praktikum.Pertemuan2.mahasiswa20;

public class Mahasiswa20 {
    String nama;
    String kelas;
    String nim;
    double ipk;

    Mahasiswa20(){   
    }
    Mahasiswa20(String nm, String name, String kls, double ip){
        nama = name;
        nim = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInfo(){
        System.out.println("NAMA        : "+nama);
        System.out.println("NIM         : "+ nim);
        System.out.println("KELAS       : "+kelas);
        System.out.println("IPK         : "+ ipk);
    }
}
