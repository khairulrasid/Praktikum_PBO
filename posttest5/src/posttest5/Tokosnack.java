
package posttest5;


public final class Tokosnack extends TokoSembako{
    private String kategori;
    private String Jumlah;
    
        public final String jenis = "Snack";
    
        public Tokosnack(String namaPembeli, int stok_barang, String Jenis, int harga_barang,String kategori, String           size_chart) {
        super(namaPembeli, stok_barang,Jenis, harga_barang);
        this.kategori = kategori;
        this.Jumlah = Jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }
    
    @Override
    public void tambah(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|  Produk " + this.jenis + " Berhasil Ditambahkan  |");
        System.out.println("------------------------------------------------");        
    }
    
    @Override
    public void edit(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Diubah    |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Dihapus   |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void TokoSembako(){
       System.out.println("Nama Produk                    : " + getNamaPembeli());
       System.out.println("Jumlah Stok                    : " + getStok_barang());
       System.out.println("Gender (laki/perempuan)        : " + getJenis());
       System.out.println("Harga Produk                   : " + getHarga_barang());
       System.out.println("Kategori (SlimFit/Oversize)    : " + kategori);
       System.out.println("Size  (small/medium/big/bigcore)   : " + Jumlah);
    }

    void Jumlah(String Jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
