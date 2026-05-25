package Praktikum.Pertemuan2;

public class matakuliahMain20 {public static void main(String[] args) {
    matakuliah20 matkul1 = new matakuliah20();
    matkul1.nama = "STRUKDAT";
    matkul1.kodeMk = "21321312";
    matkul1.sks = 19;
    matkul1.jumlahJam = 20;

    matkul1.tampilkanInformasi();
    matkul1.ubahSKS(21);
    matkul1.tambahJam(3);
    matkul1.kurangJam(2);
    matkul1.tampilkanInformasi();

    matakuliah20 matkul2 = new matakuliah20("AGAMA", "2112412", 21,31);
    matkul2.tampilkanInformasi();
}
}
