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

        //practise 3 run
        File objectsDestination = new File("src/main/resources/object_destination.txt");
        write(objectsDestination, "collection with five string objects");

        //practise 4 run.
        // here I copied the objects created in practice 2 and moved...
        //...to folder for practice3 (String of 5 objects)
        File source = new File("src/main/resources/lineNames.txt");
        File destination = new File("src/main/resources/object_destination.txt");
        copy(source, destination);

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
    public static void write(File destination, String objects){
        try(FileWriter writer = new FileWriter(destination)){
            if (!destination.exists()){
                destination.createNewFile();
            }
            writer.write(objects);
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    public static void copy(File source, File destination){
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
        ){
           byte[] buffer = new byte[1024];
           int bytesRead;
           while((bytesRead = in.read(buffer)) > 0){
               out.write(buffer, 0, bytesRead);
               out.flush();
           }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}

