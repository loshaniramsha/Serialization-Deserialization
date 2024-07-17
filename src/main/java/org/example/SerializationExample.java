package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String [] args) {

        Student student=new Student("Loshani",21);
        String fileName="file.ser";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException is caught");
        }

    }

}
