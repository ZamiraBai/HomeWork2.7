package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>(5);
        System.out.println("Список-А");
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        System.out.println(listA);

        listA.ensureCapacity(10);
        ArrayList<String> listB = new ArrayList<>(10);
        System.out.println("Список-Б");
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();
        System.out.println("Список-С");
        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);
        listC.addAll(listA);
        listC.addAll(listB);
        System.out.println(listC);

        Collections.sort(listC);
        listC.toString().length();
        System.out.println(listC);
    }
}
