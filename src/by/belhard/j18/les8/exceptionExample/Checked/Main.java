package by.belhard.j18.les8.exceptionExample.Checked;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/nofile.no");
        try {
            method1(file);
        }catch(IOException e){
            e.printStackTrace();
        }
        System.err.println("Выключение....");

    }

    private static void method1(File file) throws IOException {
        System.err.println("method1 is dead");
        OutputStream stream = new FileOutputStream(file);
        stream.write(1);

    }

}


