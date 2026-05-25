package Praktikum.Pertemuan11;
import java.util.Scanner;

public class SLLMain19 {
    public static void main(String[] args) {
        SingleLinkedList19 sll = new SingleLinkedList19();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Data Diri Mahasiswa-1 : ");
        System.out.print("Nim : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();
        Mahasiswa19 mhs1 = new Mahasiswa19(nim, nama, kelas, ipk);
        
        Mahasiswa19 mhs2 = new Mahasiswa19("2", "Aurel", "1H", 3.1);
        Mahasiswa19 mhs3 = new Mahasiswa19("3", "Dirga", "1H", 3.7);
        Mahasiswa19 mhs4 = new Mahasiswa19("4", "Siska", "1H", 2.3);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data Index-1 : ");
        sll.getData(1);

        System.out.println("data Mahasiswa an Aurel berada pada index" + sll.indexOf("Aurel"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
    
}
