/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MahlukHidup.Hewan;

/**
 *
 * @author LENOVO
 */
// Main class
public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple("Red Delicious"),
                new Orange("Navel Orange"),
                new Banana()
        };

        for (Fruit fruit : fruits) {
            FoodProcessor.processFruit(fruit);
        }
    }
}
