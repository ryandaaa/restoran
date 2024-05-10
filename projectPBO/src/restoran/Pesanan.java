package restoran;

import java.util.Scanner;

public class Pesanan {

    int makananYangDipesan;
    String perulangan;

    public Pesanan() {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Mau Pesan Makanan Apa? (1/2/3/4/5): ");
            makananYangDipesan = input.nextInt();
            System.out.print("Ada Tambahan? (y/t):");
            perulangan = input.next();
            } while (perulangan.equals("y"));
        }
    }

