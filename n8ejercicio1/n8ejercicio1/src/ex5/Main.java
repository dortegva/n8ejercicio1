package ex5;

public class Main {

    public static void main(String[] args) {
        FunctionalInterface pi = () -> 3.1415;

        System.out.println(pi.getValuePi());

    }
}
