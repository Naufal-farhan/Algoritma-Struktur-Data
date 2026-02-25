package Praktikum.Pertemuan2;

public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "1414124";
        dosen1.nama = "JAMAL KALAM";
        dosen1.status = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "AGAMA";

        dosen1.tampilkanInformasi();
        dosen1.setStatus(false);
        dosen1.hitungMasaKerja(2020);
        dosen1.ubahKeahlian("SEPAK BOLA");
        dosen1.tampilkanInformasi();

        Dosen20 dosen2 = new Dosen20("21412551","ASEP HARUZO",false,2013,
        "PROGRAMMING");
        dosen2.tampilkanInformasi();
    }
}
