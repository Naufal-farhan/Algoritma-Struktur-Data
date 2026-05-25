package Praktikum.Pertemuan5;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa m = new Mahasiswa("", "", 0, 0, 0);

        System.out.println("-------------------------------------------");
        System.out.println("HASIL PENGOLAHAN DATA MAHASISWA");
        System.out.println("-------------------------------------------");
        
        int max = m.cariMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        int min = m.cariMinUTS(daftarMhs, 0, daftarMhs.length - 1);
        
        double rata = m.rataUASBF(daftarMhs);

        System.out.println("Nilai UTS Tertinggi (DC) : " + max);
        System.out.println("Nilai UTS Terendah (DC)  : " + min);
        System.out.printf("Rata-rata Nilai UAS (BF) : %.2f\n", rata);
        System.out.println("-------------------------------------------");
    }
}