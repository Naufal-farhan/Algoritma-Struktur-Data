package Praktikum.Pertemuan6;

public class Dosen20 {
    String nama;
    String NIP;
    int usia;
    boolean jenisKelamin;
    Dosen20(){
    
    }
     Dosen20(String nama, String NIP, int usia, boolean jenisKelamin){
        this.nama = nama;
        this.NIP = NIP;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }
    void tampilInfo(){
        System.out.println("NAMA                                     : "+nama);
        System.out.println("NIM                                      : "+ NIP);
        System.out.println("USIA                                     : "+usia);
        System.out.println("JENIS KELAMIN(LAKI-LAKI = true)          : "+ jenisKelamin);
    }
}
