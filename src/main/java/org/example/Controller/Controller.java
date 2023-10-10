package org.example.Controller;

import org.example.Data.Toy;
import org.example.Service.MyGet;
import org.example.Service.Myput;
import org.example.Service.Save;

import java.util.List;

public class Controller {
    List<Toy> myToyList = Myput.putToy();
    MyGet myGet = new MyGet(myToyList.get(0).getChance(),
            myToyList.get(1).getChance(),
            myToyList.get(2).getChance());
    Save save = new Save();
    public void start(){
        System.out.println(myToyList);
        System.out.println(myGet.Get());
        for (int i = 0; i < 10; i++) {
            save.SaveToFile(myGet.Get());
        }

    }
}
