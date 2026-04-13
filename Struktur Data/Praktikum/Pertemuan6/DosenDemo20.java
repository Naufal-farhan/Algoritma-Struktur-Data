package Praktikum.Pertemuan6;

public class DosenDemo20 {
    public static void main(String[] args) {
        SortingDosen list = new SortingDosen();

        Dosen20 m1 = new Dosen20("Agus","123",25,true);
        Dosen20 m2 = new Dosen20("Abdi","124",35,true);
        Dosen20 m3 = new Dosen20("Dika","125",55,true);
        Dosen20 m4 = new Dosen20("Koko","126",23,true);
        Dosen20 m5 = new Dosen20("jihan","127",27,false);
        Dosen20 m6 = new Dosen20("Agung","128",35,true);
        Dosen20 m7 = new Dosen20("Vika","129",85,false);
        Dosen20 m8 = new Dosen20("Santi","130",28,false);
        Dosen20 m9 = new Dosen20("Koko","131",95,true);
        Dosen20 m10= new Dosen20("Lala","132",41,false);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        list.tambah(m6);
        list.tambah(m7);
        list.tambah(m8);
        list.tambah(m9);
        list.tambah(m10);

        System.out.println("Data Sebelum Disorting");
        list.tampil();

        System.out.println("DATA SETELAH DISORTING BERDASARKAN USIA DENGAN BUBBLE SORT(ASC)");
        list.ascBublle();
        list.tampil();
        System.out.println("DATA SETELAH DISORTING BERDASARKAN USIA DENGAN INSERTION SORT(DSC)");
        list.dscInsertion();
        list.tampil();
    }   
}
