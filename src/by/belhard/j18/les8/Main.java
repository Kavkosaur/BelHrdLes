package by.belhard.j18.les8;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/nofile.no");
        try {
            OutputStream stream = new FileOutputStream(file);

            stream.write(1);
        } catch (FileNotFoundException e ){}
    }
}
