package ex2;

import java.util.ArrayList;

public class Cinclletres {
    public static void main(String[] args) {
        ArrayList<String> llistaParaules = new ArrayList<String>();
        llistaParaules.add("Yegua");
        llistaParaules.add("Canasta");
        llistaParaules.add("Rubor");
        llistaParaules.add("Melocotón");
        llistaParaules.add("Mano");
        llistaParaules.add("Ojo");

        llistaParaules.stream()
                .map(s->s.toUpperCase())
                .filter(s -> s.contains("O") && s.length()>5)
                .forEach(s -> System.out.print(s + "\n"));
}}
