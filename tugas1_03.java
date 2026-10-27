import java.util.Scanner;

public class tugas1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
      int hargaTiket = 500000;
      int jumlahTiket;
      int totalTiket = 0;

      double hargaBayar, totalPenjualan = 0;

      while (true) {
        System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
        jumlahTiket = sc.nextInt();
        if (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah tiket yang benar.");
            continue;
        }
        if (jumlahTiket == 0) {
            break;
        }

             hargaBayar = jumlahTiket * hargaTiket;

        if (jumlahTiket >= 10) {
            hargaBayar = hargaBayar * 0.15;
            System.out.println("diskon 15%");
        } else if (jumlahTiket > 4) {
            hargaBayar = hargaBayar * 0.10;
            System.out.println("diskon 10%");
        } else {
            System.out.println("tidak ada diskon");
        }

        System.out.println("Total yangibayar: Rp " + hargaBayar);
        System.out.println("apakah anda ingin membeli tiket lagi? (ya/tidak)");
        String tiket = sc.next();

        totalTiket += jumlahTiket;
        totalPenjualan += hargaBayar;
      }

      System.out.println("Total tiket yang terjual: " + totalTiket);
      System.out.println("Total penjualan: Rp " + totalPenjualan);

    }
}
