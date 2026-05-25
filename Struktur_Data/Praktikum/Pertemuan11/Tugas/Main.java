package Praktikum.Pertemuan11.Tugas;

public class Main {
    public static void main(String[] args) {
        QueueMahasiswa antreanKemahasiswaan = new QueueMahasiswa();

        System.out.println("--- SIMULASI ANTREAN UNIT KEMAHASISWAAN ---");

        antreanKemahasiswaan.enqueue(new Mahasiswa("24001", "Andi", "Legalisir Ijazah"));
        antreanKemahasiswaan.enqueue(new Mahasiswa("24002", "Budi", "Pengajuan Beasiswa"));
        antreanKemahasiswaan.enqueue(new Mahasiswa("24003", "Cici", "Sanksi Akademik"));

        System.out.println();
        antreanKemahasiswaan.displaySize();

        System.out.println();
        antreanKemahasiswaan.printQueue();

        System.out.println();
        antreanKemahasiswaan.peek();

        System.out.println();
        antreanKemahasiswaan.dequeue();

        System.out.println();
        antreanKemahasiswaan.peek();
        antreanKemahasiswaan.displaySize();

        System.out.println();
        antreanKemahasiswaan.clear();
        antreanKemahasiswaan.printQueue();
    }
}