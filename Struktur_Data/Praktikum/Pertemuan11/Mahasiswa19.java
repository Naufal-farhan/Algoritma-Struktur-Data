package Praktikum.Pertemuan11;
public class Mahasiswa19 {
    String nama, nim, kelas;
    double ipk;

    Mahasiswa19() {
    }

    Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    void tampilInfo(){
         System.out.println(nim + " - " + nama + " - " + ipk + " - " + kelas );
    }
}