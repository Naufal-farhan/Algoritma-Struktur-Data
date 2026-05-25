package Praktikum.Pertemuan10.LatihanPraktikum;

public class Queue {
    Mahasiswa[] data;
    int size, front, rear, max;
    int totalDiproses;
    int batasPerDPA = 30;

    public Queue() {
    }

    public Queue(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDiproses = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!!..");
        } else {
            System.out.println("Queue masih kosong!!...");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Queue sudah penuh! Maksimal " + max + " mahasiswa.");
            return;
        }
        if (totalDiproses >= batasPerDPA) {
            System.out.println("DPA sudah mencapai batas maksimal " + batasPerDPA + " mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Berhasil masuk ke antrian. Posisi: " + size);
    }

    public void layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong. Tidak ada mahasiswa untuk diproses.");
            return;
        }

        int jumlahDiproses = Math.min(2, size); 

        System.out.println("\n===== PROSES KRS =====");
        for (int i = 0; i < jumlahDiproses; i++) {
            System.out.print("Mahasiswa #" + (i + 1) + " Terproses: ");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
        System.out.println("Total diproses sesi ini: " + jumlahDiproses);
        System.out.println("======================\n");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong.");
            return;
        }
        System.out.println("\nDaftar Mahasiswa dalam Antrian :");
        System.out.println("No. NIM - NAMA - PRODI - KELAS");
        System.out.println("-------------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
        System.out.println();
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong!!..");
            return;
        }
        int tampil = Math.min(2, size);
        System.out.println("\nMahasiswa Terdepan (maks. 2):");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
        System.out.println();
    }

    public Mahasiswa lihatAkhir() {
        if (!isEmpty()) {
            return data[rear];
        } else {
            System.out.println("Queue Kosong!!..");
            return null;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDiproses() {
        return totalDiproses;
    }

    public int getBelumKRS() {
        return size;
    }

    public int getSisaKuotaDPA() {
        return batasPerDPA - totalDiproses;
    }
}