package Praktikum.Pertemuan10.LatihanPraktikum;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Queue queue = new Queue(10);

    public static void main(String[] args) {
        int pilihan;
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║    SISTEM ANTRIAN KRS - DOSEN PA (DPA)       ║");
        System.out.println("║    Kapasitas Antrian : 10  |  Kuota DPA : 30 ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        do {
            menu();
            System.out.print("Pilihan Anda : ");
            pilihan = bacaInt();

            switch (pilihan) {
                case 1 -> tambahAntrian();
                case 2 -> prosesKRS();
                case 3 -> cetakJumlah();
                case 4 -> tampilkanDepanAkhir();
                case 5 -> tampilkanSemua();
                case 6 -> queue.clear();
                case 0 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }

    public static void menu() {
        System.out.println();
        System.out.println("====== MENU ANTRIAN KRS ======");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses KRS (2 mahasiswa)");
        System.out.println("3. Cetak Jumlah Antrian & Statistik");
        System.out.println("4. Tampilkan 2 Terdepan & Paling Akhir");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Kosongkan Antrian (Clear)");
        System.out.println("0. Keluar");
        System.out.println("------------------------------");
    }

    static void tambahAntrian() {
        System.out.println("\n--- Tambah Mahasiswa ke Antrian ---");
        System.out.print("NIM    : ");
        String nim = sc.nextLine().trim();
        System.out.print("Nama   : ");
        String nama = sc.nextLine().trim();
        System.out.print("Prodi  : ");
        String prodi = sc.nextLine().trim();
        System.out.print("Kelas  : ");
        String kelas = sc.nextLine().trim();

        Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
        queue.tambahAntrian(mhs);
    }

    static void prosesKRS() {
        queue.layaniMahasiswa();
    }

    static void cetakJumlah() {
        System.out.println("\n===== STATISTIK ANTRIAN KRS =====");
        System.out.println("Jumlah dalam antrian    : " + queue.getJumlahAntrian());
        System.out.println("Sudah proses KRS        : " + queue.getTotalDiproses());
        System.out.println("Belum proses KRS        : " + queue.getBelumKRS());
        System.out.println("Sisa kuota DPA          : " + queue.getSisaKuotaDPA() + " / 30");
        System.out.println("=================================");
    }

    static void tampilkanDepanAkhir() {
        System.out.println("\n--- 2 Mahasiswa Terdepan ---");
        queue.peek();

        System.out.println("--- Mahasiswa Paling Akhir ---");
        Mahasiswa akhir = queue.lihatAkhir();
        if (akhir != null) {
            System.out.println("NIM - NAMA - PRODI - KELAS");
            akhir.tampilkanData();
        }
        System.out.println();
    }

    static void tampilkanSemua() {
        queue.print();
    }

    static int bacaInt() {
        while (true) {
            try {
                int val = Integer.parseInt(sc.nextLine().trim());
                return val;
            } catch (NumberFormatException e) {
                System.out.print("Input harus angka. Ulangi: ");
            }
        }
    }
}