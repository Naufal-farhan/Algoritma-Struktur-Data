package Praktikum.Pertemuan6;

public class SortingDosen {
    Dosen20[] listDosen = new Dosen20[10];
    int idx;
    void tambah(Dosen20 m){
        if (idx < listDosen.length) {
            listDosen[idx] = m;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH ");
        }
    }
    void tampil(){
        for (Dosen20 m : listDosen) {
            m.tampilInfo();
            System.out.println("---------------------------");
        }
    }
    void ascBublle(){
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen20 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }
    void dscInsertion(){
        for(int i = 1 ; i < listDosen.length;i++){
            Dosen20 temp = listDosen[i];
            int j = i;
            while(j > 0 && listDosen[j-1].usia < temp.usia){
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}
