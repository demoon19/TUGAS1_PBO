/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author LENOVO
 */
public class kotak extends bangundatar {
    private double sisi;
    
    public kotak(double radius){
        this.sisi = radius;
    }
    
   @Override
   public double hitungLuas(){
       return sisi * sisi ;
   }
   
    @Override
    public double hitungKeliling() {
        return sisi + sisi + sisi + sisi;
    }

    @Override
    public void tampilkan() {
        System.out.println("sisi dari persegi adalah : " + sisi);
    }
}
