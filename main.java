package PBOPRAKTEK2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        Makanan [] menuMakanan ={
            new Makanan("nasi goreng", 100000, 3)
        };

        Alattulis [] menualattulis = {
            new Alattulis("bolpoin", 50000, 3)
        };

        System.out.println("----SELAMAT DATANG DI KOPERASI KELUARGA SEHAT----");
        System.out.println("1. Makanan");
        System.out.println("2. alat tulis");
        System.out.print("pilih kategori = ");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("----PILIHAN MENU----");
            for (int i=0; i<menuMakanan.length; i++){
                menuMakanan[i].tampilkanInfo(i);
            }
             System.out.print("Pilih nomor makanan yang ingin dibeli: ");
            int pilihMakanan = input.nextInt() - 1;

            if (pilihMakanan >= 0 && pilihMakanan < menuMakanan.length) {
                menuMakanan[pilihMakanan].kurangiStok();
                System.out.print("Anda membeli: " + menuMakanan[pilihMakanan].getnama());

                System.out.println("dengan harga = " + menuMakanan[pilihMakanan].getharga());
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        else if (pilihan == 2) {
            System.out.println("\n=== Menu Alat Tulis ===");
            for (int i = 0; i < menualattulis.length; i++) {
                menualattulis[i].tampilkanInfo(i);
            }

            System.out.print("Pilih nomor alat tulis yang ingin dibeli: ");
            int pilihAlat = input.nextInt() - 1;

            if (pilihAlat >= 0 && pilihAlat < menualattulis.length) {
                menualattulis[pilihAlat].kurangiStok();
                System.out.println("Anda membeli: " + menualattulis[pilihAlat].getnama());
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } else {
            System.out.println("Pilihan kategori tidak ada!");
        }

        input.close();
    }
}
    