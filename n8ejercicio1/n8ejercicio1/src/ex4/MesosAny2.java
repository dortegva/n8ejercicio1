package ex4;

import java.util.ArrayList;

public class MesosAny2 {

        public static void main(String[] args) {
            ArrayList<String> llistaMesos = new ArrayList<String>();
            llistaMesos.add("Gener");
            llistaMesos.add("Febrer");
            llistaMesos.add("Març");
            llistaMesos.add("Abril");
            llistaMesos.add("Maig");
            llistaMesos.add("Juny");
            llistaMesos.add("Juliol");
            llistaMesos.add("Agost");
            llistaMesos.add("Setembre");
            llistaMesos.add("Octubre");
            llistaMesos.add("Novembre");
            llistaMesos.add("Desembre");


            llistaMesos.forEach(System.out::println);
        }

}
