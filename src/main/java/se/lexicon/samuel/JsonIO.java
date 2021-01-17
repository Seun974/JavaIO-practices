package se.lexicon.samuel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonIO {
    private ObjectMapper objectMapper;
    //implementing the enabler, configure and register module
    public JsonIO(){
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.registerModule(new JavaTimeModule());
    }
    public void serializeToJsonCar(List<Car_register> source, File file1){
        try{
            if(!file1.exists()){
                file1.createNewFile();
            }
            objectMapper.writeValue(file1, source);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void serializeToJsonOwner(List<Owner_register> source, File file2){
        try{
            if(!file2.exists()){
                file2.createNewFile();
            }
            objectMapper.writeValue(file2, source);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public List<Car_register> deserializeCar(File file1){
        List<Car_register> car_register = new ArrayList<>();
        try{
            car_register = objectMapper.readValue(file1, new TypeReference<List<Car_register>>() {});
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return car_register;
    }
    public List<Owner_register> deserializeOwner(File file2){
        List<Owner_register> owner_register = new ArrayList<>();
        try{
            owner_register = objectMapper.readValue(file2, new TypeReference<List<Owner_register>>() {});

        }catch(IOException ex){
            ex.printStackTrace();
        }
        return owner_register;
    }
}
