package org.example.Service;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public static void SaveToFile(int id){
        String str = Integer.toString(id);
        try{
            FileWriter writer = new FileWriter("result.txt", true);
            writer.write(str+ "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
