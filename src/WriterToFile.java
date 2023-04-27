//package storage;



import java.io.*;
import java.util.List;

public class WriterToFile<T> {

        public void writeToSaveFile(List<T> exportList){
            File save = new File("test.csv");
            try(FileOutputStream fileOutputStream = new FileOutputStream(save);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream) ){
                objectOutputStream.writeObject(exportList);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

