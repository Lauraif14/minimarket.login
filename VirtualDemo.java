import java.util.*;
import java.text.*;

public class VirtualDemo {
    public static void main(String[] args) {
        // Deklarasi variabel
        String username, password, inputUsername, inputPassword, inputCaptcha;
        int captcha;
        boolean inputValid = false;
        Date hariSekarang = new Date();
        username = "admin";
        password = "siAdmin";
        captcha = 111;

        // Membaca input username dari pengguna
        System.out.print("Masukkan username: ");
        Scanner scanner = new Scanner(System.in);
        inputUsername = scanner.nextLine();

        // Membaca input password dari pengguna
        System.out.print("Masukkan password: ");
        inputPassword = scanner.nextLine();

        // Membaca input captcha dari pengguna
        System.out.print("Masukkan captcha: ");
        inputCaptcha = scanner.nextLine();

        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss a zzz");
        do {
            try {
                // Mengecek apakah username dan password yang dimasukkan oleh pengguna benar
                    if (username.equals(inputUsername) && password.equals(inputPassword)) {
                        // Jika benar, tampilkan pesan "Login berhasil"
                        System.out.println("Login berhasil");
                    } else {
                        // Jika salah, tampilkan pesan "Login gagal"
                        System.out.println("Login gagal");
                    }

                // Mengecek apakah input captcha sama dengan captcha yang benar
                    if (captcha == Integer.parseInt(inputCaptcha)) {
                        // Jika benar, tampilkan pesan "Captcha benar"
                        System.out.println("Captcha benar");
                    } else {
                        // Jika salah, tampilkan pesan "Captcha salah"
                        System.out.println("Captcha salah");
                    } if (!username.equals(inputUsername) || !password.equals(inputPassword)) {
                        throw new InputMismatchException();
                    }

                System.out.print("kode barang\t\t: ");
                String kodeBarang = scanner.nextLine();

                System.out.print("nama pelanggan\t\t: ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("nomor HP pelanggan\t: ");
                String nomorHP = scanner.nextLine();

                System.out.print("alamat pelanggan\t: ");
                String alamatPelanggan = scanner.nextLine();

                System.out.print("nama barang\t\t: ");
                String namaBarang = scanner.nextLine();

                System.out.print("harga barang\t\t: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("jumlah barang\t\t: ");
                int jumlahBarang = scanner.nextInt();

                // Membuat objek Pembali
                Pembelian pembelian = new Pembelian (kodeBarang, namaPelanggan, nomorHP, alamatPelanggan, namaBarang, hargaBarang, jumlahBarang);

                // Menampilkan detail Invoice dan total bayar
                System.out.println("==============================================");
                System.out.println("\t\tMINIMART");
                System.out.println("----------------------------------------------");
                System.out.println("Tanggal\t: " + tanggal.format(hariSekarang));
                System.out.println("Waktu\t: " + waktu.format(hariSekarang));
                System.out.println("==============================================");
                System.out.println("\t\tDATA PELANGGAN\t");
                System.out.println("----------------------------------------------");
                pembelian.tampilInfo();
                System.out.println("TOTAL BAYAR\t: " + pembelian.hitungTotalBayar());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Kasir\t: Laura");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input Data \n");
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); 
            }
        } while (!inputValid);

        scanner.close();
    }
}  
