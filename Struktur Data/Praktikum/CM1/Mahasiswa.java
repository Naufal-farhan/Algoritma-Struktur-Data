package Praktikum.CM1;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    Mahasiswa(){    
    }
    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    public void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
