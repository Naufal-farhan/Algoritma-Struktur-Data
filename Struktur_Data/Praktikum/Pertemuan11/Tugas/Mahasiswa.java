package Praktikum.Pertemuan11.Tugas;

public class Mahasiswa {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan;
    }
}