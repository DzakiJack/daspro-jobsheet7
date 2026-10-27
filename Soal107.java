import java.util.Scanner;

public class Soal107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tiket, total, sementara, totalTiket = 0, totalHarga = 0, harga = 50000;
        int i = 1;
        String ingin;

        while (i >= 0) {
            System.out.println("Penjualan ke-" + i);
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextDouble();
            sementara = tiket * harga;
            
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid!");
                continue;
            }

            if (tiket > 4) {
                total = sementara - (sementara * 0.1);
            } else if (tiket > 10) {
                total = sementara - (sementara * 0.15);
            } else {
                total = sementara;
            }

            totalTiket += tiket;
            totalHarga += total;

            System.out.println("Total harga yang harus dibayar: Rp " + (int) total);
            System.out.print("Apakah ingin melanjutkan penjualan? (ya/tidak): ");
            ingin = sc.next();

            if (ingin.equalsIgnoreCase("tidak")) {
                break;
            }
            i++;
        }
        sc.close();

        System.out.println("Total tiket terjual: " + (int) totalTiket);
        System.out.println("Total harga penjualan: Rp " + (int) totalHarga);
    }
    
}
