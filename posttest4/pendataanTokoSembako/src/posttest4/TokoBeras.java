
package posttest4;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TokoBeras extends TokoSembako {
  private final String kodeTK = "TK";
    private long noKodeTK;
    
    TokoBeras(String namaBrg, String satuan, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeBrg){
        super(namaBrg,satuan,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeBrg);
    }
    
    TokoBeras() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    TokoBeras TK;
    ArrayList<TokoSembako> TKList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    
    @Override
    public void tambahBarang(){
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH BERAS                       |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Beras : ");
        namaBrg = inp.nextLine();
        System.out.print("Satuan : ");
        satuan = inp.nextLine();
        System.out.print("Stok Awal  : ");
        stokAwal = inputInt.nextInt();
        System.out.print("Stok Masuk  : ");
        stokMasuk = inputInt.nextInt();
        System.out.print("Stok Keluar  : ");
        stokKeluar = inputInt.nextInt();

        while(ulang){
            System.out.print("Harga Beli Beras [Satuan] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Beras [Satuan] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeBrg++;
                    System.out.println("No Kode Barang : " + kodeTK + noKodeTK);
                    TK = new TokoBeras(namaBrg, satuan, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeBrg); // OBJEK ke - 1
                    TKList.add(TK);
                    System.out.println("\n>> Tambah Data Beras Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    @Override
    public void tampilBarang(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL BERAS                       |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Beras : " + kodeTK + TKList.get(i).getNoKodeBrg());
            System.out.println("\tNama Beras : " + TKList.get(i).getNamaBrg());
            System.out.println("\tJenis Satuan : " + TKList.get(i).getSatuan());
            System.out.println("\tStok Awal : " + TKList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + TKList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + TKList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (TKList.get(i).getStokAwal()+TKList.get(i).getStokMasuk()-TKList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Beras [Satuan] : Rp" + TKList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Beras [Satuan] : Rp" + TKList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    @Override
    public ArrayList<TokoSembako> ubahBarang(ArrayList<TokoSembako> Brglist) {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  UBAH BERAS                      |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("No Kode Barang : " + kodeTK +
            TKList.get(i).getNoKodeBrg());
            System.out.println("Nama BERAS : " + TKList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        if (TKList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Beras : ");
        TKList.get(ubah).namaBrg = (inp.nextLine());
        System.out.print("Ubah Jenis Satuan : ");
        TKList.get(ubah).satuan = (inp.nextLine());
        System.out.print("Ubah Stok Awal : ");
        TKList.get(ubah).stokAwal = (inp.nextInt());
        System.out.print("Ubah Stok Masuk : ");
        TKList.get(ubah).stokMasuk = (inp.nextInt());
        System.out.print("Ubah Stok Keluar : ");
        TKList.get(ubah).stokKeluar = (inp.nextInt());
        System.out.print("Ubah Harga Beli Beras [Satuan] : ");
        TKList.get(ubah).hargaBeli = (inp.nextInt());
        System.out.print("Ubah Harga Jual Beras [Satuan] : ");
        TKList.get(ubah).hargaJual = (inp.nextInt());
        System.out.println("\n>> Data Beras Berhasil Di Ubah <<\n");

        return TKList;
    }
    
    @Override
    public ArrayList<TokoSembako> hapusBarang(ArrayList<TokoSembako> TKlist) {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS DATA BERAS                   |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("No Kode Beras : " + kodeTK +
            TKList.get(i).getNoKodeBrg());
            System.out.println("Nama Beras : " + TKList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Data Beras [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        TKList.remove(hapus);
        System.out.println("\n>> Data Beras Berhasil di Hapus <<\n");
        return TKList;
    }

}
