package se.lexicon.samuel;

import java.io.Serializable;
//SERIALIZATION PRACTICE 5
public class Car implements Serializable {

    private String regNumber;
    private String brand;
    private String model;
    private String colour;
    private int serviceMonth;

    public Car(String regNumber, String brand, String model, String colour, int serviceMonth) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.serviceMonth = serviceMonth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", serviceMonth=" + serviceMonth +
                '}';
    }
}
