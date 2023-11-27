/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166010.pbo.lat54;

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 54
 */

class Koordinat {
    // Atribut
    private int x;
    private int y;

    // Konstruktor
    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class WarnaKoordinat extends Koordinat {
    private String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    
    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}

public class Lat54_Koordinat {
    public static void main(String[] args) {
        // Membuat objek WarnaKoordinat
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");

        // Menampilkan output sesuai dengan studi kasus
        System.out.println("Warna Koordinat: " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x: " + warnaKoordinat.getX() + ", y: " + warnaKoordinat.getY());
    }
    
}