/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tudor
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getSalesPrice method, of class Car.
     */
    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        Car instance = new Car(Car.Marca.DACIA, Car.Culoare.RED, 180, 240, 18000);
        double expResult = 18000;
        double result = instance.getSalesPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    }

    /**
     * Test of getDailyRentingPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentingPrice() {
        System.out.println("getDailyRentingPrice");
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.WHITE, 250, 600, 42000);
        double expResult = 600;
        double result = instance.getDailyRentingPrice();
        assertEquals(600, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentingPrice method, of class Car.
     */
    @Test
    public void testSetRentingPrice() {
        System.out.println("setRentingPrice");
        double rentingPrice = 100.0;
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.BLACK, 230, 460, 50000);
        instance.setRentingPrice(rentingPrice);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(rentingPrice, instance.getDailyRentingPrice(), 0.0);
    }

    /**
     * Test of setSalesPrice method, of class Car.
     */
    @Test
    public void testSetSalesPrice() {
        System.out.println("setSalesPrice");
        double salesPrice = 250.0;
        Car instance = new Car(Car.Marca.RENAULT, Car.Culoare.BLUE, 200, 520, 32000);
        instance.setSalesPrice(salesPrice);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        Assert.assertEquals(salesPrice, instance.getSalesPrice(), 0.0);
    }

    /**
     * Test of getCarColor method, of class Car.
     */
    @Test
    public void testGetCarColor() {
        System.out.println("getCarColor");
        Car instance = new Car(Car.Marca.DACIA, Car.Culoare.BLACK, 160, 230, 11000);
        Car.Culoare expResult = Car.Culoare.BLACK;
        Car.Culoare result = instance.getCarColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarColor method, of class Car.
     */
    @Test
    public void testSetCarColor() {
        System.out.println("setCarColor");
        Car.Culoare carColor = Car.Culoare.YELLOW;
        Car instance = new Car(Car.Marca.RENAULT, Car.Culoare.WHITE, 220, 380, 36000);
        instance.setCarColor(carColor);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        Assert.assertEquals(carColor, instance.getCarColor());
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.BLACK, 240, 560, 44000);
        double expResult = 240;
        double result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        double speed = 200;
        Car instance = new Car(Car.Marca.DACIA, Car.Culoare.WHITE, 180, 320, 24000);
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals(speed, instance.getSpeed(), 0.0);
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.BLACK, 280, 700, 60000);
        Car.Marca expResult = Car.Marca.MERCEDES;
        Car.Marca result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Car.Marca name = Car.Marca.DACIA;
        Car instance = new Car(Car.Marca.DACIA, Car.Culoare.BLACK, 220, 240, 27000);
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals(name, instance.getName());
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        double newSpeed = 270;
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.WHITE, 250, 520, 42000);
        instance.increaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        Assert.assertEquals(newSpeed, instance.getSpeed(), 0.0);
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        double newSpeed = 220;
        Car instance = new Car(Car.Marca.MERCEDES, Car.Culoare.WHITE, 250, 520, 42000);
        instance.decreaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals(newSpeed, instance.getSpeed(), 0.0);
    }
    
}
