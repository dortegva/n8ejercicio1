package ex7;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> llistaParaules = new ArrayList<String>();
        llistaParaules.add("Yegua");
        llistaParaules.add("Canasta");
        llistaParaules.add("Rubor");
        llistaParaules.add("Melocotón");
        llistaParaules.add("Mano");
        llistaParaules.add("Ojo");

        llistaParaules.sort(Comparator.comparing(String::length).reversed());

        llistaParaules.forEach(System.out::println);
    }
}