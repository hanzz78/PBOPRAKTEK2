package PBOPRAKTEK2;
public class Makanan {
    private String nama;
    private double harga;
    private int stok;

    public Makanan(String nama, double harga, int stok){
        this.nama = nama;
        this.harga=harga;
        this.stok=stok;
    }
    public String getnama(){
        return nama;
    }
    public double getharga(){
        return harga;
    }
    public int getstok(){
        return stok;
    }
     public void kurangiStok() {
        if (stok > 0) {
            stok--;
        } else {
            System.out.println("Stok " + nama + " habis!");
        }
    }
    public void tampilkanInfo(int index) {
        System.out.println((index+1) + ". " + nama + " | Rp" + harga + " | Stok: " + stok);
}}