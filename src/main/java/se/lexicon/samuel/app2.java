package se.lexicon.samuel;

import java.io.*;
import java.util.Arrays;
import java.util.List;

//SERIALIZATION PRACTICE 5
public class app2 {

    public static void main(String[] args) {


        List<Car> car = Arrays.asList(
                new Car("AXY 123", "volvo", "V40", "Dark Blue",36),
                new Car("KLM 003", "Toyota", "Corolla", "White",24),
                new Car("VXM 456", "Nissan", "Qashqai", "Black",30)
        );
        File file = new File("src/main/resources/cars.ser");

        //writing
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(car);


        }catch(IOException ex){
            ex.printStackTrace();
        }

        //reading
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
            Object deserialized = in.readObject();
            System.out.println(deserialized.toString());


        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
