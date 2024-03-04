/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author LENOVO
 */
public class persegipanjang extends bangundatar {
    private double panjang;
    private double lebar;

    public persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public void tampilkan() {
        System.out.println("panjang dari persegi panjang adalah : " + panjang + " dan lebar: " + lebar);
    }
}