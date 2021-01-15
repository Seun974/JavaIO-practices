package se.lexicon.samuel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        //practice 1 run data
        File characters = new File("src/main/resources/randomText.txt");
        System.out.println(readCharacters(characters).toString());
        //practice 2 run
        File lines = new File("src/main/resources/lineNames.txt");
        System.out.println(readLines(lines).toString());

    }

    public static String readCharacters(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader reader = new FileReader(file)){
            int i;
            while((i = reader.read()) != -1){
                char letter = (char) i;
                stringBuilder.append(letter);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return stringBuilder.toString();
    }
    public static List<String> readLines(File nameFile){
        List<String> strings = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(nameFile))){
            String line;
            while((line = reader.readLine()) != null){
                strings.add(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return strings;
    }
    public static

}

