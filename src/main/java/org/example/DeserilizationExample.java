package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {
    public static void main(String[] args) {
        Student student=null;
        try {
            FileInputStream fileInputStream=new FileInputStream("file.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            student=(Student)objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Student class not found");
            e.printStackTrace();
        }
        if (student!=null){
            System.out.println("Deserialized Student...");
            System.out.println("Name:"+student.getName());
            System.out.println("Age:"+student.getAge());
          }
        }
    }

