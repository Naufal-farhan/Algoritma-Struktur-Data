package Praktikum.Pertemuan3;

public class DataDosen20 {

    void dataSemuaDosen(Dosen20[] arrayofDosen) {
        System.out.println("============ DATA SEMUA DOSEN ===========================");
        for (Dosen20 dsn : arrayofDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("--------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen20[] arrayofDosen) {
        int p = 0, w = 0;
        for (Dosen20 dsn : arrayofDosen) {
            if (dsn.jenisKelamin) {
                p++;
            } else {
                w++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + p);
        System.out.println("Jumlah Dosen Wanita : " + w);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayofDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen20 dsn : arrayofDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        if (jmlPria > 0) {
            System.out.println("Rata-Rata Usia Pria : " + (totalUsiaPria / jmlPria));
        }
        if (jmlWanita > 0) {
            System.out.println("Rata-Rata Usia Wanita : " + (totalUsiaWanita / jmlWanita));
        }
    }

    void dosenPalingTua(Dosen20[] arrayofDosen) {

        Dosen20 palingtua = arrayofDosen[0];
        for (Dosen20 dsn : arrayofDosen) {
            if (dsn.usia > palingtua.usia) {
                palingtua = dsn;
            }
        }
        System.out.println("Dosen yang paling tua adalah : " + palingtua.nama);
        System.out.println("Dengan usia : " + palingtua.usia + "-Tahun");
    }

    void dosenPalingMuda(Dosen20[] arrayofDosen) {

        Dosen20 palingmuda = arrayofDosen[0];
        for (Dosen20 dsn : arrayofDosen) {
            if (dsn.usia < palingmuda.usia) {
                palingmuda = dsn;
            }
        }
        System.out.println("Dosen yang paling muda adalah : " + palingmuda.nama);
        System.out.println("Dengan usia : " + palingmuda.usia + "-Tahun");
    }
}
