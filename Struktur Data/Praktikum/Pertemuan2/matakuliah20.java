package Praktikum.Pertemuan2;

public class matakuliah20 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("NAMA : "+nama);
        System.out.println("Kode MK : "+kodeMk);
        System.out.println("SKS : "+sks);
        System.out.println("Jumlah Jam : "+jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diperbaharui menjadi : " + sks);
    }
    void tambahJam(int jamTambahan){
        jumlahJam += jamTambahan;
    }
    void kurangJam(int jamKurangan){
        if(jamKurangan < jumlahJam){
            jumlahJam -= jamKurangan;
        } else {
            System.out.println("Jumlah pengurangan melewati batas Jumlah jam seharusnya!.");
        }
    }
    public matakuliah20(){

    }
    public matakuliah20(String nama,String kodeMk, int sks, int jumlahJam){
        this.nama = nama;
        this.kodeMk = kodeMk;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
