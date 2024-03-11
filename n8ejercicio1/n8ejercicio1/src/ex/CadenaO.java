package ex;

import java.util.ArrayList;


public class CadenaO {
    public static void main(String[] args) {
        ArrayList<String> llistaParaules = new ArrayList<String>();
        llistaParaules.add("Yegua");
        llistaParaules.add("Canasta");
        llistaParaules.add("Rubor");
        llistaParaules.add("Melocotón");

        llistaParaules.stream()
                .map(s->s.toUpperCase())
                .filter(s -> s.contains("O"))
                .forEach(s -> System.out.print(s + "\n"));
    }
}
