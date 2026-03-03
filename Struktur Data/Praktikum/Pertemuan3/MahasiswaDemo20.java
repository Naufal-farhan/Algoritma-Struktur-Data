package Praktikum.Pertemuan3;

import Praktikum.Pertemuan2.mahasiswa20;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Mahasiswa20[] arrayOfMahasiswa20 = new Mahasiswa20[3];

        arrayOfMahasiswa20[0] = new Mahasiswa20();
        arrayOfMahasiswa20[0].nim = "1412141441";
        arrayOfMahasiswa20[0].nama = "Agnes Titanina Kinanti";
        arrayOfMahasiswa20[0].kelas = "SIB-1E";
        arrayOfMahasiswa20[0].ipk = (float)3.35;

        arrayOfMahasiswa20[1] = new Mahasiswa20();
        arrayOfMahasiswa20[1].nim = "1413341441";
        arrayOfMahasiswa20[1].nama = "Ahmad Maulana Hamzah";
        arrayOfMahasiswa20[1].kelas = "TI-2A";
        arrayOfMahasiswa20[1].ipk = (float)3.36;

        arrayOfMahasiswa20[2] = new Mahasiswa20();
        arrayOfMahasiswa20[2].nim = "1682141441";
        arrayOfMahasiswa20[2].nama = "Dirmawa Putranto";
        arrayOfMahasiswa20[2].kelas = "TI-2E";
        arrayOfMahasiswa20[2].ipk = (float)3.80;
        
        System.out.println("--------------------------------------------");
        System.out.println("NIM   : "+arrayOfMahasiswa20[0].nim);
        System.out.println("NAMA  : "+arrayOfMahasiswa20[0].nama);
        System.out.println("KELAS : "+arrayOfMahasiswa20[0].kelas);
        System.out.println("IPK   : "+arrayOfMahasiswa20[0].ipk);
        System.out.println("--------------------------------------------");
        
        System.out.println("NIM   : "+arrayOfMahasiswa20[1].nim);
        System.out.println("NAMA  : "+arrayOfMahasiswa20[1].nama);
        System.out.println("KELAS : "+arrayOfMahasiswa20[1].kelas);
        System.out.println("IPK   : "+arrayOfMahasiswa20[1].ipk);
        System.out.println("--------------------------------------------");
        
        System.out.println("NIM   : "+arrayOfMahasiswa20[2].nim);
        System.out.println("NAMA  : "+arrayOfMahasiswa20[2].nama);
        System.out.println("KELAS : "+arrayOfMahasiswa20[2].kelas);
        System.out.println("IPK   : "+arrayOfMahasiswa20[2].ipk);
        System.out.println("--------------------------------------------");
    }
}
