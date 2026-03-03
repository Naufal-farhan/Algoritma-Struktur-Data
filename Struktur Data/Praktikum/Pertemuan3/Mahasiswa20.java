package Praktikum.Pertemuan3;
public class Mahasiswa20 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
    
    void cetakinfo(int i){
         System.out.println("Data Mahasiswa ke-"+(i+1)+" : ");
            System.out.println("NIM   : "+ nim);
            System.out.println("NAMA  : "+nama);
            System.out.println("KELAS : "+kelas);
            System.out.println("IPK   : "+ipk);
            System.out.println("--------------------------------------------");
    }
}
