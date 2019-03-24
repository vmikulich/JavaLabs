package by.bsu.lab5.readWrite;

import by.bsu.lab5.entity.Plane;
import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {

    private final static Logger logger = Logger.getLogger(ReadFile.class);

    public void writePlanes(String path, List<Plane> planes) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(planes);
            objectOutputStream.flush();
        } catch(IOException e) {
            logger.error(e);
        }
    }
}
