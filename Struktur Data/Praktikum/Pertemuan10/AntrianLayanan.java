package Praktikum.Pertemuan10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int size, front, rear, max;

    public AntrianLayanan() {
    }

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa Terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        } else {
            System.out.println("Queue Masih Kosong!!!..");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!!..");
        } else {
            System.out.println("Queue masih kosong!!...");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Berhasil masuk ke antrian.");
    }

    public Mahasiswa LayaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong.");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public Mahasiswa lihatAkhir() {
        if(!isEmpty()){
            return data[rear];
        } else{
            System.out.println("Queue Kosong!!..");
            return null;
        }
    }
}
