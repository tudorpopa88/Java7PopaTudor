/*
 * Class Car
 */
package autoservice;

/**
 *
 * @author tudor
 */
public class Car implements Saleable, Rentable {

    public enum Culoare {RED, YELLOW, BLUE, BLACK, WHITE};
    public enum Marca {MERCEDES, RENAULT, DACIA};
    
    private Culoare carColor = Culoare.BLACK;
    private double speed = 0.0;
    private Marca name = Marca.DACIA;
    
    private double rentingPrice = 0;
    private double salesPrice = 0;
    
    @Override
    public double getSalesPrice() {
        return salesPrice;
    }

    @Override
    public double getDailyRentingPrice() {
        return rentingPrice;
    }

    public void setRentingPrice(double rentingPrice) {
        this.rentingPrice = rentingPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Culoare getCarColor() {
        return carColor;
    }

    public void setCarColor(Culoare carColor) {
        this.carColor = carColor;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Marca getName() {
        return name;
    }

    public void setName(Marca name) {
        this.name = name;
    }

    public void increaseSpeed(double newSpeed) {
        if (newSpeed > speed) {
            speed = newSpeed;
        } else if (newSpeed < speed) { 
            decreaseSpeed(newSpeed);
        }
    }
    
    public void decreaseSpeed(double newSpeed) {
        if (newSpeed < speed) {
            speed = newSpeed;
        } else if (newSpeed > speed) {
            increaseSpeed(newSpeed);
        }
    }
    
    Car (Marca nouaMarca, Culoare nouaCuloare, double nouaViteza, double newRentingPrice, double newSalesPrice) {
        salesPrice = newSalesPrice;
        rentingPrice = newRentingPrice;
        carColor = nouaCuloare;
        name = nouaMarca;
        speed = nouaViteza;
    }
}
