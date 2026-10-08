package pertemuan7;

import java.util.Scanner;

public class studiKasus2_14 {

    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        String namaMahasiswa;
        String Kegiatan;
        int jmlDokumen;
        int peringkatJuara;
        int statusPendanaan = 0;

        System.out.print("Masukan Nama Mahasiswa : ");
        namaMahasiswa = iqbal.nextLine();
        System.out.print("Masukan Jenis Kegiatan : ");
        Kegiatan = iqbal.nextLine();
        System.out.print("Masukan Jumlah Dokumen : ");
        jmlDokumen = iqbal.nextInt();
        System.out.print("Masukan Peringkat Juara : ");
        peringkatJuara = iqbal.nextInt();


        if (Kegiatan.equalsIgnoreCase("BELMAWA") 
            || Kegiatan.equalsIgnoreCase("BAKORMA")
            || Kegiatan.equalsIgnoreCase("Mandiri")) {
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Memperoleh Dana Penghargaan");
                } else {                        int dokumenKurang = 4 - jmlDokumen;
                    System.out.printf("Status : Dokumen tidak lengkap (kurang %d dokumen). Dana penghargaan tidak diberikan", dokumenKurang);
                }
            } else {
                System.out.println("Status : Peringkat lomba tidak sesuai. Dana penghargaan tidak diberikan");
            }
        } else if (Kegiatan.equalsIgnoreCase("PKM")) {
                    System.out.print("Masukan Status Pendanaan PKM : ");
            statusPendanaan = iqbal.nextInt();
            if (statusPendanaan == 1) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Memperoleh Dana Penghargaan");
                } else {
                    int dokumenKurang = 4 - jmlDokumen;
                    System.out.printf("Status : Dokumen tidak lengkap (kurang %d dokumen). Dana penghargaan tidak diberikan", dokumenKurang);
                }
            } else {
                System.out.println("Status : Tidak memperoleh pendanaan PKM. Dana penghargaan tidak diberikan");
            }
        }

        iqbal.close();
    }
}