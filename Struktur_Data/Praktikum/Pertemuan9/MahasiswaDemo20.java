package Praktikum.Pertemuan9;

import java.util.*;

public class MahasiswaDemo20 {
  public static void main(String[] args) {
    StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
    Scanner sc = new Scanner(System.in);
    int pilih;
    int tugas = 0;
    do {
      System.out.println("\nMenu  : ");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Daftar Tugas");
      System.out.println("5. Melihat Tugas Terbawah");
      System.out.println("6. Melihat Total Tugas Yang Sudah Terkumpul");
      System.out.print("Pilih Menu !!... : ");
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
          System.out.printf("Tugas %s Berhasil Dikumlpulkan\n", mhs.nama);
          tugas++;
          break;

        case 2:
          Mahasiswa20 dinilai = stack.pop();
          if (dinilai != null) {
            System.out.println("Menilai Tugas Dari -" + dinilai.nama);
            System.out.print("Masukkan nilai dari (0-100) : ");
            int nilai = sc.nextInt();
            dinilai.tugasDinilai(nilai);
            System.out.printf("Nilai tugas %s adalah %d\n ", dinilai.nama, nilai);
            String biner = stack.konversiDesimalKeBinar(nilai);
            System.out.println("Nilai Biner Tugas : "+ biner);
            tugas--;
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

          case 5 :
            Mahasiswa20 lihatBawah = stack.peekBot();
            if(lihatBawah != null){
              System.out.println("Tugas Pertama dikumpulkan oleh-"+lihatBawah.nama);
            }
            break;
          case 6 : 
            System.out.println("Banyak Tugas yang Sudah Dikumpulkan saat ini : "+ tugas);
            break;
          
          default :
            System.out.println("Pilihan Tidak Valid!!...");
      }
    } while (pilih >= 1 && pilih <= 6);
  }
}
