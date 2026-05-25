package Praktikum.Pertemuan10;

public class Mahasiswa {
    String nim, nama, kelas, prodi;

    Mahasiswa(){
    }
    Mahasiswa(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }
    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas );
    }
}
