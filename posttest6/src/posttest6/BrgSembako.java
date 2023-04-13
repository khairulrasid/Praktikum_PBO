
package posttest6;

public final class BrgSembako extends TokoSembako implements Supplier{
      private int Banyak;
    private String namaBarang;
    
     public final String jenis = "Brg Sembako";
    
        public BrgSembako(String namaPembeli, int stok_barang, String Jenis, int harga_barang, int Banyak, String namaBarang) {
        super(namaPembeli, stok_barang,Jenis, harga_barang);
        this.Banyak = Banyak;
        this.namaBarang = namaBarang;
    }
    public int getBanyak() {
        return Banyak;
    }

    public void setBanyak(int Banyak) {
        this.Banyak = Banyak;
    }

    public String getnamaBarang() {
        return namaBarang;
    }

    public void setnamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    @Override
    public void tambah(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|  Produk " + this.jenis + " Berhasil Ditambahkan    |");
        System.out.println("------------------------------------------------");         
    }
    
    @Override
    public void edit(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Diubah      |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Dihapus     |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void TokoSembako(){
       System.out.println("Nama Produk                    : " + getNamaPembeli());
       System.out.println("Jumlah Stok                    : " + getStok_barang());
       System.out.println("Gender 1(laki/perempuan)        : " + getJenis());
       System.out.println("Harga Produk                   : " + getHarga_barang());
       System.out.println("Sebanyak                           : " + Banyak);
       System.out.println("Produk                          : " + namaBarang);
       System.out.println("Tahun Produksi                 : " + Kode_Barang());
       System.out.println("Made in                        : " + Made_In());
    }
    @Override
    public String Kode_Barang(){
        return "2109";
    }
    @Override
    public String Made_In(){
        return "Indonesia ";
    }
}
