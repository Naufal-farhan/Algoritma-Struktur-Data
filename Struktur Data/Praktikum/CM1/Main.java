package Praktikum.CM1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data;
        Mahasiswa[] listMhs = {
                new Mahasiswa("Andi", "22001", "Teknik Informatika"),
                new Mahasiswa("Budi", "22002", "Teknik Informatika"),
                new Mahasiswa("Citra", "22003", "Sistem Informasi Bisnis"),
        };
        Buku[] listbuku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024),
        };
        Peminjaman[] listPeminjaman = {
                new Peminjaman(listMhs[0], listbuku[0], 7),
                new Peminjaman(listMhs[1], listbuku[1], 3),
                new Peminjaman(listMhs[2], listbuku[2], 10),
                new Peminjaman(listMhs[2], listbuku[3], 6),
                new Peminjaman(listMhs[0], listbuku[1], 4),
        };
        String pilihan;
        int j = 0;
        do {
            tampilMenu();
            System.out.print("Pilih menu!... : ");
            pilihan = sc.nextLine();
            switch (pilihan) {
                case "1":
                    menu1(listMhs); // MENU TAMPILKAN DATA MAHASISWA
                    j++;
                    break;
                case "2":
                    menu2(listbuku);// MENU TAMPILKAN DATA BUKU
                    break;
                case "3":
                    menu3(listPeminjaman);// MENU TAMPILKAN DATA PEMINJAMAN
                    break;
                case "4":
                    menu4(listPeminjaman); // MENU URUTKAN DENDA
                    break;
                case "5":
                    menu5(listPeminjaman); // MENU CARI NIM
                    break;
                case "0": // MENU EXIT
                    System.out.println("Anda telah keluar dari Menu");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid, Masukkan kembali!!...");
                    System.out.println();
            }
        } while (!pilihan.equals("0"));
    }

    public static void tampilMenu() {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. TAMPILKAN MAHASISWA");
        System.out.println("2. TAMPILKAN BUKU");
        System.out.println("3. TAMPILKAN PEMINJAMAN");
        System.out.println("4. URUTKAN BERDASARKAN DENDA");
        System.out.println("5. CARI BERDASARKAN NIM");
        System.out.println("0. KELUAR");
    }

    public static void menu1(Mahasiswa[] listMhs) {
        System.out.println("------------------------------------------------------------");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].tampilMahasiswa();
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void menu2(Buku[] listbuku) {
        System.out.println("------------------------------------------------------------");
        System.out.println("DAFTAR BUKU");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < listbuku.length; i++) {
            listbuku[i].tampilBuku();
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void menu3(Peminjaman[] listPeminjaman) {
        System.out.println("------------------------------------------------------------");
        System.out.println("DAFTAR PEMINJAMAN");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < listPeminjaman.length; i++) {
            listPeminjaman[i].tampilPeminjaman();
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void menu4(Peminjaman[] listPeminjaman) {
        for (int i = 1; i <= listPeminjaman.length - 1; i++) {
            Peminjaman temp = listPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && listPeminjaman[j].denda < temp.denda) {
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j + 1] = temp;
        }
        for (int n = 0; n < listPeminjaman.length; n++) {
            listPeminjaman[n].tampilPeminjaman();
        }
    }

    public static void menu5(Peminjaman[] listPeminjaman) {
        for (int i = 1; i <= listPeminjaman.length - 1; i++) {
            Peminjaman temp = listPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && listPeminjaman[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j + 1] = temp;
        }
        System.out.println("------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN NIM YANG INGIN ANDA CARI     :   ");
        String nim = sc.nextLine();

        int awal = 0, akhir = listPeminjaman.length - 1;
        int posisi = -1;

        while (awal <= akhir) {
            int mid = (awal + akhir) / 2;
            int cekHasil = listPeminjaman[mid].mhs.nim.compareTo(nim);
            posisi = mid;

            if (cekHasil == 0) {
                posisi = mid;
                listPeminjaman[mid].tampilPeminjaman();
                break;
            } else if (cekHasil < 0) {
                awal = mid + 1;
            } else {
                akhir = mid - 1;
            }
        }
        System.out.println("------------------------------------------------------------");
    }
}
