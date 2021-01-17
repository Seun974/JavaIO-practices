package se.lexicon.samuel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;


public class Car_register implements Serializable{

    private UUID carID;
    private String regNumber;
    private String brand;
    private String model;
    private LocalDate regDate;
    private String owner;

    public Car_register(String regNumber, String brand, String model, LocalDate regDate, String owner) {
        this.carID = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }
    Car_register(){

    }

    public UUID getCarID() {
        return carID;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_register that = (Car_register) o;
        return carID == that.carID &&
                Objects.equals(regNumber, that.regNumber) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(regDate, that.regDate) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, regNumber, brand, model, regDate, owner);
    }

    @Override
    public String toString() {
        return "Car_register{" +
                "carID=" + carID +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate=" + regDate +
                ", owner='" + owner + '\'' +
                '}';
    }
}
