package Praktikum.Pertemuan9.LatihanPraktikum;

public class StackSurat {
    Surat20[] stack;
    int top, size;

    StackSurat(int size) {
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat20 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh, tidak bisa menambahkan tugas lagi!!.");
        }
    }

    public Surat20 pop() {
        if (!isEmpty()) {
            Surat20 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong, Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Surat20 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong, tidak ada tugas untuk dilihat!!..");
            return null;
        }
    }

    public void cari(String key){
        for(int i = 0 ; i < stack.length; i++){
            if(stack[i].nama.equalsIgnoreCase(key)){
                System.out.println("ID SURAT     : "+stack[i].idSurat);
                System.out.println("NAMA         : "+stack[i].nama);
                System.out.println("KELAS        : "+stack[i].kelas);
                System.out.println("DURASI       : "+stack[i].durasi);
                System.out.println("JENIS IZIN   : "+stack[i].jenisIzin);
                break;
            }
        }
        System.out.println("Nama Yang Anda Cari Tidak Memiliki Surat!!.....");
    }

}
