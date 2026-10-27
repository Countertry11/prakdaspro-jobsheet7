import java.util.Scanner;

public class KafeDoWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int Kopi, Teh, Roti;
        int hargaKopi = 5000, hargaTeh = 3000, hargaRoti = 4000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'exit' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("exit")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            Kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            Teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            Roti = sc.nextInt();
            totalHarga = (Kopi * hargaKopi) + (Teh * hargaTeh) + (Roti * hargaRoti);
            System.out.println("Total Harga: Rp " + totalHarga);
            sc.nextLine(); 
        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
}