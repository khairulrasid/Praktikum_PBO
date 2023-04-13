package posttest6;

public abstract class TokoSembako {
     private String namaPembeli;
    private int stok_barang;
    private String Jenis;
    private int harga_barang;

    public TokoSembako(String namaPembeli, int stok_barang, String Jenis, int harga_barang) {
        this.namaPembeli = namaPembeli;
        this.stok_barang = stok_barang;
        this.Jenis = Jenis;
        this.harga_barang = harga_barang;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public int getStok_barang() {
        return stok_barang;
    }

    public void setStok_barang(int stok_barang) {
        this.stok_barang = stok_barang;
    }

    public String getJenis() {
        return Jenis;
    }


    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public double getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
    
    public void tambah(){
        System.out.println("------------------------------------------------");
        System.out.println("|       Barang toko Berhasil Ditambahkan!       |");
        System.out.println("------------------------------------------------");        
    }
    
    public void edit(){
        System.out.println("------------------------------------------------");
        System.out.println("|          Barang toko Berhasil Diubah!        |");
        System.out.println("------------------------------------------------");   
    }
    
    public void hapus(){
        System.out.println("------------------------------------------------");
        System.out.println("|         Barang toko Berhasil Dihapus!         |");
        System.out.println("------------------------------------------------");   
    }
    
    //Overloading
    public void toko(String namaPembeli, int harga_barang){
        System.out.println("\n------------------------------------------------");
        System.out.println("Data Nama Pembeli " + namaPembeli);
        System.out.println("Harga Rp." + harga_barang + " stok " + stok_barang + "pcs Berhasil Ditambahkan");
        System.out.println("------------------------------------------------");
    }
    
    //Overloading
    public void toko(String namaPembeli){
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("  | Data Nama Pembeli " + namaPembeli + " telah diubah |");
        System.out.println("-----------------------------------------------------------");
    }
    
    //Abstract Method
    public abstract void TokoSembako();



    //Penggunaan Static
        public static void supplier(){
        System.out.println("\nSyarat Pengambilan Barang: ");
        System.out.println("1. Batas Waktu Pengambilan Barang Maks 5 Hari");
        System.out.println("2. Tidak Menerima Pengembalian Barang Berdasarkan Kesalahan Pelanggan");
    }
}
