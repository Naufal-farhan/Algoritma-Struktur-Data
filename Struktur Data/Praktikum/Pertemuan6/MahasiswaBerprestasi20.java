package Praktikum.Pertemuan6;

public class MahasiswaBerprestasi20 {
    Mahasiswa20 [] listMhs = new Mahasiswa20[5];
    int idx;

    void tambah(Mahasiswa20 m){
        if (idx < listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("DATA SUDAH PENUH ");
        }
    }
    void tampil(){
        for(Mahasiswa20 m : listMhs){
            m.tampilInfo();
            System.out.println("---------------------------");
        }
    }
    void bubleSort(){
        for(int i= 0 ; i < listMhs.length-1;i++){
            for(int j= 1 ; j < listMhs.length-i;j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa20 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
