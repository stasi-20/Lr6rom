package com.example.lr6rom;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class test_task {

    List<Integer> NumberCollection = new ArrayList<Integer>();
    @Test
    public void Test() {
        NumberCollection.add(2);
        NumberCollection.add(4);
        NumberCollection.add(10);
        NumberCollection.add(12);
        NumberCollection.add(20);
        NumberCollection.add(24);
        NumberCollection.add(42);
        NumberCollection.add(50);
        NumberCollection.add(54);
        NumberCollection.add(60);

        System.out.println("До замены элементов: " + NumberCollection);
        System.out.println("Коллекция номеров имеет внутри " + getCount() + " элементов. "  );

        //меняем элементы 4 и 42 местами
        replaceElements();
        System.out.println("После замены:  " + NumberCollection);
    }

    public <Integer> int  getCount() {
        int count;
        for (count = 0; count < NumberCollection.size(); count++) { }
        return count;
    }
    public <Integer> void replaceElements() {
        int v1, v2;
        v1 = NumberCollection.get(1);
        v2 = NumberCollection.get(6);
        NumberCollection.set(1, v2);
        NumberCollection.set(6, v1);
    }
}