package Praktikum.Pertemuan9;

import java.util.*;

public class MahasiswaDemo20 {
  public static void main(String[] args) {
    StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
    Scanner sc = new Scanner(System.in);
    int pilih;
    do {
      System.out.println("\nMenu  : ");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Daftar Tugas");
      System.out.println("Pilih!!... : ");
      pilih = sc.nextInt();
      sc.nextLine();
      switch (pilih) {
        case 1:
          System.out.print("Nama : ");
          String nama = sc.nextLine();
          System.out.print("NIM : ");
          String nim = sc.nextLine();
          System.out.print("Kelas : ");
          String kelas = sc.nextLine();
          Mahasiswa20 mhs = new Mahasiswa20(nama, nim, kelas);
          stack.push(mhs);
          System.out.printf("Tugas Berhasil Dikumlpulkan\n", mhs.nama);
          break;

        case 2:
          Mahasiswa20 dinilai = stack.pop();
          if (dinilai != null) {
            System.out.println("Menilai Tugas Dari -" + dinilai.nama);
            System.out.print("Masukkan nilai dari (0-100) : ");
            int nilai = sc.nextInt();
            dinilai.tugasDinilai(nilai);
            System.out.printf("Nilai tugas %s adalah %d\n ", dinilai.nama, nilai);
          }
          break;

          case 3 :
            Mahasiswa20 lihat = stack.peek();
            if(lihat != null){
              System.out.println("Tugas Terakhir dikumpulkan oleh-"+lihat.nama);
            }
            break;

          case 4 : 
            System.out.println("Daftar Semua Tugas");
            System.out.println("Nama\tNIM\tKelas");
            stack.print();
            break;

      }
    } while (pilih >= 1 && pilih <= 4);
  }
}
