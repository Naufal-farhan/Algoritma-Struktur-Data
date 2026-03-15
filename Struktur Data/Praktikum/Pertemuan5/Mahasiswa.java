package Praktikum.Pertemuan5;

public class Mahasiswa {
    public String nama;
    public String nim;
    public int tahunMasuk;
    public int nilaiUTS;
    public int nilaiUAS;

    public Mahasiswa(String nama, String nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }
    public int cariMaxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) { 
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2; 
        int maxL = cariMaxUTS(mhs, l, mid); 
        int maxR = cariMaxUTS(mhs, mid + 1, r); 
        
        return (maxL > maxR) ? maxL : maxR; 
    }
    public int cariMinUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int minL = cariMinUTS(mhs, l, mid);
        int minR = cariMinUTS(mhs, mid + 1, r);
        
        return (minL < minR) ? minL : minR;
    }

    public double rataUASBF(Mahasiswa[] mhs) {
        int total = 0;
        for (int i = 0; i < mhs.length; i++) { 
            total += mhs[i].nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}