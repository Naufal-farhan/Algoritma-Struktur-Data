package Praktikum.Pertemuan10;

import java.util.*;

public class LayananAkademikSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            System.out.println("================ LAYANAN ANTRIAN AKADEMIK SIAKAD ================");
            System.out.println("1. TAMBAH ANTRIAN MAHASISWA");
            System.out.println("2. LAYANI MAHASISWA");
            System.out.println("3. LIHAT MAHASISWA TERDEPAN");
            System.out.println("4. LIHAT SEMUA ANTRIAN");
            System.out.println("5. JUMLAH MAHASISWA DALAM ANTRIAN ");
            System.out.println("6. LIHAT ANTRIAN TERAKHIR ");
            System.out.println("0. KELUAR");
            System.out.println("------------------------------------------------------------------");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("NAMA : ");
                    String nama = sc.nextLine();
                    System.out.print("PRODI : ");
                    String prodi = sc.nextLine();
                    System.out.print("KELAS : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa dilayani = antrian.LayaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa : ");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.println("Jumlah Dalam Antrian : " + antrian.getJumlahAntrian());
                    break;
                case 6 : 
                    Mahasiswa lihatAkhir = antrian.lihatAkhir();
                    System.out.println("Mahasiswa dengan Antrian Terakhir adalah : ");
                    lihatAkhir.tampilkanData();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid ");
            }
        } while (pilihan != 0);
    }
}
