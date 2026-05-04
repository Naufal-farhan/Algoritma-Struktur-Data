package Praktikum.Pertemuan9.LatihanPraktikum;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    StackSurat stack = new StackSurat(5);
    Scanner sc = new Scanner(System.in);
    int pilih;
    int surat = 0;
    do {
      System.out.println("\nMenu  : ");
      System.out.println("1. Menerima Surat Izin");
      System.out.println("2. Proses Surat Izin");
      System.out.println("3. Melihat Izin Terakhir");
      System.out.println("4. Cari Surat Berdasarkan Nama");
      System.out.print("Pilih Menu !!... : ");
      pilih = sc.nextInt();
      sc.nextLine();
      switch (pilih) {
        case 1:
          System.out.print("Nama       : ");
          String nama = sc.nextLine();
          System.out.print("ID SURAT   : ");
          String idSurat = sc.nextLine();
          System.out.print("Kelas      : ");
          String kelas = sc.nextLine();
          System.out.print("Jenis Izin : ");
          char jenis = sc.next().charAt(0);
          System.out.print("Durasi     : ");
          int durasi = sc.nextInt();
          Surat20 mhs = new Surat20(idSurat, nama, kelas, jenis, durasi);
          stack.push(mhs);
          System.out.println("Surat Berhasil Dikumpulkan");
          surat++;
          break;

        case 2:
          Surat20 dinilai = stack.pop();
          if (dinilai != null) {
            System.out.println("Memproses Surat Dari -" + dinilai.nama);
            System.out.println("Surat Dari -" + dinilai.nama + " Sudah Diproses!!..");
            surat--;
          }
          break;

        case 3:
          Surat20 lihat = stack.peek();
          if (lihat != null) {
            System.out.println("Surat Terakhir dikumpulkan oleh-" + lihat.nama);
          }
          break;

        case 4:
          System.out.print("Masukkan nama yang ingin anda cari : ");
          String key = sc.nextLine();
          stack.cari(key);
          break;

        default:
          System.out.println("Pilihan Tidak Valid!!...");
      }
    } while (pilih >= 1 && pilih <= 4);
  }
}
