package Praktikum.Pertemuan2;

public class mahasiswa20 {
        String nama;
        String nim;
        String kelas;
        double ipk;

        void tampilkanInformasi() {
            System.out.println("Nama : "+nama);
            System.out.println("NIM : "+nim);
            System.out.println("Kelas : "+kelas);
            System.out.println("IPK : "+ipk);
        }
        void ubahKelas(String kelasBaru){
            kelas = kelasBaru;
        }
        void updateIpk(double ipkBaru){
            if(ipk > 0.0 && ipk < 4.0){
                   ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid, IPK harus rentang 0 dan 4");
            }
        }
        String nilaiKinerja(){
            if (ipk >= 3.5){
                return "kinerja sangat baik";
            } else if(ipk >= 3.0){
                return "Kinerja Baik";
            } else if(ipk >= 2.0){
                return "Kinerja Cukup";
            } else{
                return "Kinerja Kurang";
            }
        }
    }

