
package posttest5;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<BrgSembako> Bsembako = new ArrayList<>();
    static ArrayList<Tokosnack> Tsnack = new ArrayList<>();

   public static void main(String[] args) throws IOException{       
        
        while (true) {
            System.out.println("\n=======================================");            
            System.out.println("|           TOKO DAENG                |");
            System.out.println("=======================================");            
            System.out.println("| 1. TAMBAH Barang                    |");
            System.out.println("| 2. LIHAT DAFTAR BARANG              |");
            System.out.println("| 3. UBAH DATA BARANG                 |");
            System.out.println("| 4. HAPUS BARANG                     |");
            System.out.println("| 5. EXIT                             |");
            System.out.println("======================================="); 
            
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilProduk();
                    break;
                case 3:
                    ubahProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 5:   
                    keluar();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }    
   
     public static void jenisProduk()
    {
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Barang  |");
        System.out.println("|1. Sembako           |");
        System.out.println("|2. Snack         |");
        System.out.println("====================");
    }
     
    static final void keluar(){
        System.out.println("\n=======================================");            
        System.out.println("|     TERIMA KASIH SUDAH BERKUNJUNG     |");
        System.out.println("======================================="); 
    } 
    
     public static void tambahProduk() throws IOException {
         
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("-Masukan Data Sembako-");            
            System.out.print("Masukkan Nama Pembeli              : ");
            String namaPembeli = input.readLine();
        
            System.out.print("Masukkan Jumlah Stok              : ");
            int stok_barang = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Jenis (Hewani/Nabati)  : ");
            String Jenis = input.readLine();
        
            System.out.print("Masukkan Harga Barang             : ");
            int harga_barang = Integer.parseInt(input.readLine());
        
            System.out.print("Banyak Barang                     : ");
            int Banyak = Integer.parseInt(input.readLine());  
            
            System.out.print("Masukan Nama Barang                    : ");
            String namaBarang = input.readLine();
                  
            BrgSembako sbk = new BrgSembako(namaPembeli, stok_barang, Jenis, harga_barang, Banyak, namaBarang);
            Bsembako.add(sbk);
            sbk.toko(namaPembeli, harga_barang);
            sbk.tambah();
            
        }else if(pil == 2){
             System.out.println("-Masukan Anda-");            
            System.out.print("Masukkan Nama Pembeli              : ");
            String namaPembeli = input.readLine();
        
            System.out.print("Masukkan Jumlah Stok              : ");
            int stok_barang = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Jenis (Hewani/Nabati)  : ");
            String Jenis = input.readLine();
        
            System.out.print("Masukkan Harga Barang             : ");
            int harga_barang = Integer.parseInt(input.readLine());
        
        
            System.out.print("Masukkan Kategori(Ringan/Berat) : ");
            String kategori = input.readLine();
            
            System.out.print("Size  (small/medium/big/bigcore)): ");
            String Jumlah = input.readLine();
            
            Tokosnack dws = new Tokosnack(namaPembeli, stok_barang, Jenis, harga_barang, kategori, Jumlah);
            Tsnack.add(dws);
            dws.toko(namaPembeli, harga_barang);
            dws.tambah();
            

        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }
     
    public static void tampilProduk() throws IOException{
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("-Data Pakaian Anak-");  
            if (Bsembako.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < Bsembako.size();i++){
                System.out.println("\nProduk Ke-" + (i+1));
                Bsembako.get(i).TokoSembako();
                    }
                }
                System.out.println("\n-------------------------------------------------");
        }else if(pil == 2){
            System.out.println("-Data Pakaian Dewasa-");  
            if (Tsnack.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < Tsnack.size();i++){
                System.out.println("\nProduk Ke-" + (i+1));
                Tsnack.get(i).TokoSembako();
                }
            }
                System.out.println("\n-------------------------------------------------");
        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }     

    static void ubahProduk()throws IOException {
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (Bsembako.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                
                 for(int i = 0; i < Bsembako.size();i++){
                    System.out.println("Barang Snack Dengan Ukuran " + i+1);
                    
                    Bsembako.get(i).TokoSembako();
                    }
                 
                System.out.print("Masukkan Ukuran Barang yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if (index <= Bsembako.size() || index > 0) {
                    
                    System.out.println("\n-Masukkan Barang yang baru-");
                    
                    System.out.print("Masukkan Nama Anda               : ");                  
                    String namaPembeli = input.readLine();
                    Bsembako.get(index-1).setNamaPembeli(namaPembeli);
                    
                    System.out.print("Masukkan Jumlah Stok               : ");
                    int stok_barang = Integer.parseInt (input.readLine());
                    Bsembako.get(index-1).setStok_barang(stok_barang);
                    
                    System.out.print("Masukkan Jenis (Hewani/Nabati)   : ");
                    String Jenis = input.readLine();
                    Bsembako.get(index-1).setJenis(Jenis);
                    
                    System.out.print("Masukkan Harga Barang              : ");
                    int harga_barang = Integer.parseInt (input.readLine());
                    Bsembako.get(index-1).setHarga_barang(harga_barang);
                    
                    System.out.print("Masukkan Banyak Barang                      : ");
                    int Banyak = Integer.parseInt (input.readLine());
                    Bsembako.get(index-1).setBanyak(Banyak);   
                    
                    System.out.print("Masukkan Nama Barang                     : ");
                    String namaBarang = input.readLine();
                    Bsembako.get(index-1).setnamaBarang(namaBarang);                    
                    
                    Bsembako.get(index-1).toko(namaPembeli);
                    Bsembako.get(index-1).edit();
                }else{
                    System.out.println("indeks tidak ditemukan");
                }
            }
        }else if(pil == 2){
            if (Tsnack.isEmpty()) {
                System.out.println("Belum ada Barang yang tersimpan!");
            } else {
                
                for(int i = 0; i < Tsnack.size();i++){
                    System.out.println("Barang Snack Dengan Ukuran  " + i+1);
                    
                    Tsnack.get(i).TokoSembako();
                    }
                
                System.out.print("Masukkan Ukuran Snack yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index <= Tsnack.size() || index > 0){
                    
                    System.out.println("\n-Masukkan Barang snack yang baru-");
                    
                    System.out.print("Masukkan Nama Anda                  : ");                  
                    String namaPembeli = input.readLine();
                    Tsnack.get(index-1).setNamaPembeli(namaPembeli);
                    
                    System.out.print("Masukkan Jumlah Stok                  : ");
                    int stok_barang = Integer.parseInt (input.readLine());
                    Tsnack.get(index-1).setStok_barang(stok_barang);
                    
                    System.out.print("Masukkan Jenis (Hewani/Nabati)      : ");
                    String Jenis = input.readLine();
                    Tsnack.get(index-1).setJenis(Jenis);
                    
                    System.out.print("Masukkan Harga Barang                 : ");
                    int harga_barang = Integer.parseInt (input.readLine());
                    Tsnack.get(index-1).setHarga_barang(harga_barang);
                    
                    System.out.print("Masukkan Kategori (Ringan/Berat)  : ");
                    String kategori = input.readLine();
                    Tsnack.get(index-1).setKategori(kategori);    
                    
                    System.out.print("Size  (small/medium/big/bigcore)) : ");
                    String Jumlah = input.readLine();
                    Tsnack.get(index-1).Jumlah(Jumlah); 
                    
                    Tsnack.get(index-1).toko(namaPembeli);
                    Tsnack.get(index-1).edit();
                }
                else{
                    System.out.println("indeks tidak ditemukan");
                }
            }
            
        }else{
            System.out.println("Pilihan tidak ada!");
        }
    }
    
    static void hapusProduk() throws IOException{
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (Bsembako.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                
                for(int i = 0; i < Bsembako.size();i++){
                System.out.println("Barang Snack Dengan Jumlah" + i+1);
                    
                Bsembako.get(i).TokoSembako();
                }
                
                System.out.print("Masukkan Jumlah yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= Bsembako.size() || index > 0) 
                {
                    Bsembako.remove(index-1).hapus();
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (Tsnack.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                
                for(int i = 0; i < Tsnack.size();i++){
                System.out.println("Barang Snack Dengan Ukuran " + i+1);
                    
                Tsnack.get(i).TokoSembako();
                }
                
                System.out.print("Masukkan Jumlah yang ingin dihapus: ");
                
                int index = Integer.parseInt(input.readLine());
                if(index <= Tsnack.size() || index > 0) 
                {
                    Tsnack.remove(index-1).hapus();
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Pilihan tidak ada!");
        }
        
    }
    
}
