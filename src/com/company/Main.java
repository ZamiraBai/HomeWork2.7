package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(5);
        System.out.println("Список-А");
        listA.add("A-1");
        listA.add("A-2");
        listA.add("A-3");
        listA.add("A-4");
        listA.add("A-5");

        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
        }

        ArrayList<String> listB = new ArrayList<>(10);
        System.out.println("Список-Б");
        listB.add("B-1");
        listB.add("B-2");
        listB.add("B-3");
        listB.add("B-4");
        listB.add("B-5");

        iterator = listB.iterator();
        while (iterator.hasNext()) {
            String ee = iterator.next();
            System.out.println(ee);
        }

        ArrayList<String> listC = new ArrayList<>();
        listC.add("A-1");
        listC.add("B-5");
        listC.add("A-2");
        listC.add("B-4");
        listC.add("A-3");
        listC.add("B-3");
        listC.add("A-4");
        listC.add("B-2");
        listC.add("A-5");
        listC.add("B-1");

        System.out.println(listC);

        Collections.sort(listC);
        listC.toString().length();

        System.out.println(listC);
    }
}
