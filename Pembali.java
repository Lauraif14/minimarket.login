class Pembelian extends Barang implements HitungTotalBayar {
    public final char[] tampilInfo = null;
    private String noFaktur;
    private String namaPelanggan;
    private String nomorHP;
    private String alamatPelanggan;


    public Pembelian(String noFaktur, String namaPelanggan, String nomorHP, String alamatPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamatPelanggan = alamatPelanggan;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBarang;
    }

    @Override
    public void tampilInfo(){
        System.out.println("No.Faktur\t: " + noFaktur);
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No HP\t\t: " + nomorHP);
        System.out.println("Alamat\t\t: " + alamatPelanggan);
        super.tampilInfo();

    }
}