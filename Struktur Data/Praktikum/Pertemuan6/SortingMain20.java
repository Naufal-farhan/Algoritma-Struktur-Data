package Praktikum.Pertemuan6;

public class SortingMain20 {
   public static void main(String[] args) {
        int[] a = {20,10,2,7,12};
        int[] b = {30,20,2,8,14};
        int[] c = {40,10,4,9,3};
        Sorting20 dataUrut1 = new Sorting20(a,a.length);
        Sorting20 dataUrut2 = new Sorting20(b,b.length);
        Sorting20 dataUrut3 = new Sorting20(c,c.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan Bubble Sort");
        dataUrut1.tampil();
        System.out.println();
        System.out.println("Data Awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();;
        System.out.println("Data Sudah Diurutkan dengan Selection Sort ");
        dataUrut2.tampil();
        System.out.println();
        System.out.println("Data Awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();;
        System.out.println("Data Sudah Diurutkan dengan Insertion Sort ");
        dataUrut3.tampil();
    } 
}
