/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MahlukHidup.Hewan;

/**
 *
 * @author LENOVO
 */
class FoodProcessor {
    static void processFruit(Fruit fruit) {
        System.out.println("Processing " + fruit.name + ":");
        fruit.peel();
        fruit.cut();
        fruit.taste();
        if (fruit instanceof Edible) {
            ((Edible) fruit).eat();
        }
        System.out.println();
    }
}