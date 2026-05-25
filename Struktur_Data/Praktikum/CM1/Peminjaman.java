package Praktikum.CM1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;

    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    
    public Peminjaman(Mahasiswa m, Buku b , int lamaPinjam){
        this.mhs = m;
        this.buku = b;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = 2000 * (terlambat);
        }else{
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman(){
        System.out.println(mhs.nama+" | "+buku.judul+" | "+lamaPinjam+" | Terlambat : "+terlambat+" | Denda : "
        +denda);
    }

}
