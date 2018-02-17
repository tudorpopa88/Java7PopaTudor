/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author tudor
 */
public class TestCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mertzanul = new Car(Car.Marca.MERCEDES, Car.Culoare.BLACK, 230, 460, 50000);
        Car renaultul = new Car(Car.Marca.RENAULT, Car.Culoare.YELLOW, 180, 120, 2300);
        Car dacia = new Car(Car.Marca.DACIA, Car.Culoare.RED, 60, 60, 999);
    }
    
}
