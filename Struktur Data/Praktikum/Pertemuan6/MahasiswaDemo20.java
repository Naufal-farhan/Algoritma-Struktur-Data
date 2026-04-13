package Praktikum.Pertemuan6;
import java.util.*;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list  = new MahasiswaBerprestasi20();
        String[][] arr = new String[5][3];
        int[]   arrIPK = new int[5];
        
        for(int i = 0; i < 5 ; i++){
            System.out.println("MASUKKAN DATA MAHASISWA KE-"+(i+1)+" : ");
            System.out.print("Masukkan NIM    :");
            arr[i][0] = sc.nextLine();
            System.out.print("Masukkan NAMA   :");
            arr[i][1] = sc.nextLine();
            System.out.print("Masukkan KELAS  :");
            arr[i][2] = sc.nextLine();
            System.out.print("Masukkan IPK    :");
            arrIPK[i] = sc.nextInt();   
            sc.nextLine();
        }

        Mahasiswa20 m1 = new Mahasiswa20(arr[0][0],arr[0][1], arr[0][2],arrIPK[0]);
        Mahasiswa20 m2 = new Mahasiswa20(arr[1][0],arr[1][1], arr[1][2],arrIPK[1]);
        Mahasiswa20 m3 = new Mahasiswa20(arr[2][0],arr[2][1], arr[2][2],arrIPK[2]);
        Mahasiswa20 m4 = new Mahasiswa20(arr[3][0],arr[3][1], arr[3][2],arrIPK[3]);
        Mahasiswa20 m5 = new Mahasiswa20(arr[4][0],arr[4][1], arr[4][2],arrIPK[4]);
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("DATA MAHASISWA SEBELUM SORTING : ");
        list.tampil();

        System.out.println("DATA MAHASISWA SETELAH SORTING BERDASARKAN IPK MENGGUNAKAN BUBBLE SORT(DESC)");
        list.bubleSort();
        list.tampil();
        System.out.println("DATA MAHASISWA SETELAH SORTING BERDASARKAN IPK MENGGUNAKAN SELECTION SORT(ASC)");
        list.selectionSort();
        list.tampil();
        System.out.println("DATA MAHASISWA SETELAH SORTING BERDASARKAN IPK MENGGUNAKAN INSERTION SORT(DSC)");
        list.insertionSort();
        list.tampil();
    }
    }
