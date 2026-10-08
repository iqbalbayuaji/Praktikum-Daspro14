package pertemuan7;

import java.util.Scanner;

public class studiKasus1_14 {

    public static void main(String[] args) {
        Scanner iqbal = new Scanner(System.in);

        int hargaPerCup = 17000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.print("Masukan jumlah Cup : ");
        jumlahCup = iqbal.nextInt();
        System.out.print("Masukan uang Bayar : ");
        uangBayar = iqbal.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 48000) {
            diskon = totalHarga * 7/100;
        }

        totalBayar = totalHarga - diskon;

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Total Harga        : Rp" + totalHarga);
            System.out.println("Diskon             : Rp" + diskon);
            System.out.println("Total Bayar        : Rp" + totalBayar);
            System.out.println("Kembalian          : Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Total Harga        : Rp" + totalHarga);
            System.out.println("Diskon             : Rp" + diskon);
            System.out.println("Total Bayar        : Rp" + totalBayar);
            System.out.println("Uang Tidak cukup, kurang Rp" + kurang);
        }
        
        iqbal.close();
    }
}