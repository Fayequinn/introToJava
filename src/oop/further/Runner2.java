package oop.further;

import java.util.ArrayList;
import java.util.List;

public class Runner2 {

    public static void main(String[] args) {
List<Flyable> flyables = new ArrayList<>();

flyables.add(new Bird());
flyables.add(new Plane());
flyables.add(new Bird());

for (Flyable flyable : flyables){
    flyable.flyable();
}
    }
}
