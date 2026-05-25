package Praktikum.Pertemuan5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkaan Jumlah elemen : ");
        int elemen = sc.nextInt();

        Sum sm = new Sum(elemen);
        for(int i =0; i<elemen;i++){
            System.out.print("Masukkan Keuntungan ke-"+(i+1)+" : ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total Keuntungan dengan Brute Force : "+sm.totalBF());
        System.out.println("Total Keuntungan dengan Divide Conquer : "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}
