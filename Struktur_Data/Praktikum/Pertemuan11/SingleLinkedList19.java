package Praktikum.Pertemuan11;

import Praktikum.Pertemuan2.mahasiswa20;

public class SingleLinkedList19 {
    Node19 head;
    Node19 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node19 tmp = head;
            System.out.println("Isi Linked List :\t ");
            while (tmp != null) {
                tmp.data.tampilInfo();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong !!");
        }
    }

    public void addFirst(Mahasiswa19 input) {
        Node19 ndInput = new Node19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa19 input) {
        Node19 ndInput = new Node19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa19 input) {
        Node19 ndInput = new Node19(input, null);
        Node19 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa19 input) {
        if (index < 0) {
            System.out.println("Index Tidak Valid !!!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node19 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node19(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}