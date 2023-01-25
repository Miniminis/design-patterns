package me.whiteship.designpatterns._01_creational_patterns._01_singleton_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Mother2 mother1 = Mother2.getInstance();
        Mother2 mother2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(mother1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            mother2 = (Mother2) in.readObject();
        }

        System.out.println(mother1 == mother2);
    }
}
