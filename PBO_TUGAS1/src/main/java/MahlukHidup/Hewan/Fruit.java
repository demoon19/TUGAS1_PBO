/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MahlukHidup.Hewan;

/**
 *
 * @author LENOVO
 */
abstract class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    abstract void peel();
    abstract void cut();
    abstract void taste();
}