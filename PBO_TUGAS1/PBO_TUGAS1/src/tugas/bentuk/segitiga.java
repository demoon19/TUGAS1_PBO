/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author LENOVO
 */
public class segitiga extends bangundatar {
    private double alas;
    private double tinggi;
    
    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // Menggunakan rumus Heron untuk menghitung luas
        return (alas * tinggi) / 2;
    }

    @Override
    public double hitungKeliling() {
        return alas + alas + alas;
    }

    @Override
    public void tampilkan() {
        System.out.println("Ini adalah segitiga dengan alas: " + alas + " tinggi " + tinggi);
    }
    
}
