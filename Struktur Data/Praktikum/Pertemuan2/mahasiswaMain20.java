package Praktikum.Pertemuan2;

public class mahasiswaMain20 {
    public static void main(String[] args) {
        mahasiswa20 mhs1 = new mahasiswa20();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "1231412";
        mhs1.kelas = "TI 1-H";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1-G");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa20 mhs2 = new mahasiswa20("Annisa Nabila","123412421",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
    
}
