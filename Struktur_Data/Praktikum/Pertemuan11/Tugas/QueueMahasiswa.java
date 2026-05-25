package Praktikum.Pertemuan11.Tugas;

public class QueueMahasiswa {
    private Node head;
    private Node tail;
    private int size;

    public QueueMahasiswa() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // d. Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrean telah berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa input) {
        Node newNode = new Node(input);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk ke dalam antrean.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Gagal memanggil! Antrean masih kosong.");
            return;
        }

        Mahasiswa dipanggil = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        System.out.println("PANGGILAN: " + dipanggil.nama + " silakan menuju loket unit kemahasiswaan.");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada data terdepan maupun terakhir.");
            return;
        }
        System.out.println("=== STATUS UJUNG ANTREAN ===");
        System.out.println("Antrean Terdepan (Head) -> " + head.data);
        System.out.println("Antrean Terakhir (Tail) -> " + tail.data);
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrean saat ini: " + size + " orang.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrean Kosong.");
            return;
        }
        System.out.println("=== DAFTAR ANTREAN SAAT INI ===");
        Node temp = head;
        int no = 1;
        while (temp != null) {
            System.out.println(no + ". " + temp.data);
            temp = temp.next;
            no++;
        }
    }
}