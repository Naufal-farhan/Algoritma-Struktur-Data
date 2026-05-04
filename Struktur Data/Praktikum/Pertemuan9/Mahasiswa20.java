package Praktikum.Pertemuan9;

public class Mahasiswa20 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa20(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }
    Mahasiswa20(){}
    
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
