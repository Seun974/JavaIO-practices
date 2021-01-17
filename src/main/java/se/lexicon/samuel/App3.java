package se.lexicon.samuel;

import java.io.*;
import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App3 {

    public static void main(String[] args) {
        List<Car_register> car_register = Arrays.asList(
                new Car_register("QWE098", "Toyota", "Camry", LocalDate.parse("2021-01-16"), "Sam Ade"),
                new Car_register("BNO123", "Audi", "A6", LocalDate.parse("2020-07-20"), "Jon Doe")
        );
        List<Owner_register> owner_register = Arrays.asList(
                new Owner_register("Sam Ade", LocalDate.parse("1990-01-01")),
                new Owner_register("Julie Mark", LocalDate.parse("1980-11-09"))
        );
        JsonIO jsonIO = new JsonIO();
        jsonIO.serializeToJsonCar(car_register, new File("car_register.json"));
        jsonIO.serializeToJsonOwner(owner_register,new File("owner_register.json"));

        List<Car_register> deserializedCAr = jsonIO.deserializeCar(new File("car_register.json"));
        deserializedCAr.forEach(System.out::println);
        List<Owner_register> deserializedOwner = jsonIO.deserializeOwner(new File("owner_register.json"));
        deserializedOwner.forEach(System.out::println);
    }
}









//    Car_register carRegister = new Car_register("QWE098", "Toyota", "Camry", LocalDate.parse("2021-01-16"), "Sam Ade");
//    Owner_register ownerRegister = new Owner_register("Sam Ade", LocalDate.parse("1990-01-01"));
//
//    File file1 = new File("src/main/resources/car_register.ser");
//    File file2 = new File("src/main/resources/owner_register.ser");

//writing for both car register to serialization files
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file1))){
//                out.writeObject(carRegister);
//                }catch(IOException ex){
//                ex.printStackTrace();
//                }
//
//                try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file1))){
//                Object deserialized = in.readObject();
//                System.out.println(deserialized.toString());
//                }catch(IOException | ClassNotFoundException ex){
//                ex.printStackTrace();
//                }
//
//                try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file2))){
//                out.writeObject(ownerRegister);
//                }catch(IOException ex){
//                ex.printStackTrace();
//                }
//
//                try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file2))){
//                Object deserialized = in.readObject();
//                System.out.println(deserialized.toString());
//                }catch(IOException | ClassNotFoundException ex){
//                ex.printStackTrace();
//                }