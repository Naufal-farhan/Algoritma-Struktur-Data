package Praktikum.Pertemuan3;

import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen20[] arrayOfDosen20 = new Dosen20[3];
        String kode, nama;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.print("KODE          : ");
            kode = sc.nextLine();
            System.out.print("NAMA          : ");
            nama = sc.nextLine();
            System.out.print("JENIS KELAMIN (Pria/Wanita) : ");
            String inputJK = sc.nextLine();
            jenisKelamin = inputJK.equalsIgnoreCase("Pria");
            System.out.print("USIA          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen20[i] = new Dosen20(kode, nama, jenisKelamin, usia);
        }
        int i = 1;
        for (Dosen20 dosen : arrayOfDosen20) {
            System.out.println("------------------------------");
            System.out.println("Data Dosen ke-" + (i) + " : ");
            System.out.println("KODE          : " + dosen.kode);
            System.out.println("NAMA          : " + dosen.nama);

            String tampilJK = (dosen.jenisKelamin) ? "Pria" : "Wanita";
            System.out.println("JENIS KELAMIN : " + tampilJK);
            System.out.println("USIA          : " + dosen.usia);
            i++;
        }
        DataDosen20 dataStats = new DataDosen20();
        dataStats.dataSemuaDosen(arrayOfDosen20);
        dataStats.jumlahDosenPerJenisKelamin(arrayOfDosen20);
        dataStats.rerataUsiaDosenPerJenisKelamin(arrayOfDosen20);
        dataStats.dosenPalingMuda(arrayOfDosen20);
        dataStats.dosenPalingTua(arrayOfDosen20);
    }
}
