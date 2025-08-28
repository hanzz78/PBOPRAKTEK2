package PBOPRAKTEK2;
public class main {
    public static void main (String[] args){
        
        makanan [] menuMakanan ={
            new makanan("nasi goreng", 100000, 3)
        };

        alattulis [] menualattulis = {
            new alattulis("bolpoin", 50000, 3)
        };

        System.out.println("----SELAMAT DATANG DI KOPERASI KELUARGA SEHAT----");
        System.out.println("1. Makanan");
        System.out.println("2. alat tulis");
        System.out.print("pilih kategori = ");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("----PILIHAN MENU----");
            for (int i=0; i<menuMakanan.lenght; i++){
                menuMakanan[i].tampilkaninfo(i);
            }
             System.out.print("Pilih nomor makanan yang ingin dibeli: ");
            int pilihMakanan = input.nextInt() - 1;

            if (pilihMakanan >= 0 && pilihMakanan < menuMakanan.length) {
                menuMakanan[pilihMakanan].kurangiStok();
                System.out.println("Anda membeli: " + menuMakanan[pilihMakanan].getnama());
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        else if (pilihan == 2) {
            System.out.println("\n=== Menu Alat Tulis ===");
            for (int i = 0; i < menuAlatTulis.length; i++) {
                menuAlatTulis[i].tampilkanInfo(i);
            }

            System.out.print("Pilih nomor alat tulis yang ingin dibeli: ");
            int pilihAlat = input.nextInt() - 1;

            if (pilihAlat >= 0 && pilihAlat < menuAlatTulis.length) {
                menuAlatTulis[pilihAlat].kurangiStok();
                System.out.println("Anda membeli: " + menuAlatTulis[pilihAlat].getNama());
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } else {
            System.out.println("Pilihan kategori tidak ada!");
        }

        input.close();
    }
}
    }

    
}