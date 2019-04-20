package by.bsu.lab5.readWrite;

import by.bsu.lab5.entity.Plane;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {

    private final static Logger logger = Logger.getLogger(ReadFile.class);

    public List<Plane> readPlanes(String path) {
        List<Plane> planes = null;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            planes = (List<Plane>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            logger.error(e);
        }
        return planes;
    }
}
