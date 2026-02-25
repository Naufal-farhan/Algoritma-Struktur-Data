package Praktikum;

public class Dosen20 {
    String idDosen;
    String nama;
    boolean status;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println("ID DOSEN : "+idDosen);
        System.out.println("NAMA DOSEN : "+nama);
        System.out.println("STATUS KEAKTIFAN : "+status);
        System.out.println("TAHUN BERGABUNG : "+tahunBergabung);
        System.out.println("BIDANG KEAHLIAN : "+bidangKeahlian);
    }
    void setStatus(boolean statusBaru){
        status = statusBaru;
    }
    void hitungMasaKerja(int thnSkrg){
        int masakerja = thnSkrg - tahunBergabung;
        System.out.println("MASA KERJA DOSEN (DALAM TAHUN) : "+masakerja);
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    public Dosen20(){

    }
    public Dosen20(String idDosen, String nama, boolean status, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.status = status;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
