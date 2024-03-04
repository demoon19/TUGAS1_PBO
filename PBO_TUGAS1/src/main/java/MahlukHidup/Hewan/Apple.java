/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MahlukHidup.Hewan;

/**
 *
 * @author LENOVO
 */
class Apple extends Fruit implements Edible {
    Apple(String name) {
        super(name);
    }

    @Override
    void peel() {
        System.out.println(name + " is peeled.");
    }

    @Override
    void cut() {
        System.out.println(name + " is cut into slices.");
    }

    @Override
    void taste() {
        System.out.println(name + " tastes sweet and juicy.");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name);
    }
}