package Praktikum.Pertemuan3;

import java.util.Scanner;

import Praktikum.Pertemuan2.matakuliah20;

public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah20[] arrayOfMatakuliah20 = new Matakuliah20[3];
        String code, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1) + " : ");
            System.out.print("KODE       : ");
            code = sc.nextLine();
            System.out.print("NAMA       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah20[i] = new Matakuliah20(code, nama, sks, jumlahJam);
        }
    }
}
