package ex8;

public class Main {
    public static void main(String[] args) {
    String palabra = "Ordenador";
    String palabraReversed=" ";


    n2FunctionalInterface FunctionalInterface = ( p -> new StringBuilder(p).reverse().toString());
    palabraReversed = FunctionalInterface.reverse(palabra);

        System.out.println(palabra);
        System.out.println(palabraReversed);

}
}

