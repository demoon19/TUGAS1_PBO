/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author LENOVO
 */
public interface bentuk {
    double hitungLuas();
    double hitungKeliling();
    void tampilkan();
    
    public static void main(String[] args) {
        // Membuat objek-objek bentuk dan menguji fungsionalitas
        bentuk kotak = new kotak(7);
        bentuk persegipanjang = new persegipanjang(4, 7);
        bentuk segitiga = new segitiga(5, 7);

        kotak.tampilkan();
        System.out.println("luas dari persegi: " + kotak.hitungLuas());
        System.out.println("keliling dari persegi: " + kotak.hitungKeliling());

        persegipanjang.tampilkan();
        System.out.println("luas dari persegi panjang: " + persegipanjang.hitungLuas());
        System.out.println("keliling dari persegi panjang: " + persegipanjang.hitungKeliling());

        segitiga.tampilkan();
        System.out.println("luas dari segitiga: " + segitiga.hitungLuas());
        System.out.println("keliling segitiga: " + segitiga.hitungKeliling());
    }
    
}