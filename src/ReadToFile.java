//package storage;

//import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static List<Student> readFile(String path) {
        File file = new File("test.csv");
        FileReader fileReader = new FileReader(file);
        ObjectOutputStream reader = new ObjectOutputStream(fileReader);
        String line;
        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
        return null;
    }
}
