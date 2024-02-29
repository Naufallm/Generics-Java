package org.example;

import java.util.Scanner;

// Enum untuk jenis barang
enum JenisBarang {
    SANDANG,
    PANGAN,
    PAPAN
}

// Class Barang dengan dua generics yang berbeda
class Barang<T1, T2> {
    private T1 nama;
    private T2 harga;

    // Konstruktor Barang dengan dua generics dan satu enum
    public Barang(T1 nama, T2 harga, JenisBarang jenisBarang) {
        this.nama = nama;
        this.harga = harga;

    }

    // Method get
    public T1 getNama() {
        return nama;
    }

    public T2 getHarga() {
        return harga;
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama barang
        System.out.print("Masukkan Nama : ");
        String namaBarang = scanner.nextLine();

        // Input harga barang
        System.out.print("Masukkan Harga : ");
        double hargaBarang = scanner.nextInt();


        // Pilihan jenis barang
        System.out.println("Pilih Jenis Barang :");
        for (JenisBarang jenis : JenisBarang.values()) {
            System.out.println(jenis.ordinal() + ". " + jenis);
        }
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();
        JenisBarang jenisBarang = JenisBarang.values()[pilihan];

        // Membuat objek Barang
        Barang<String, Double> barang = new Barang<>(namaBarang, hargaBarang, jenisBarang);

        // Mengambil dan mencetak informasi Barang
        System.out.println("Informasi Barang:");
        System.out.println("Nama: " + barang.getNama());
        System.out.println("Harga: " + barang.getHarga());
        System.out.println("Jenis: " + jenisBarang);


    }
}
