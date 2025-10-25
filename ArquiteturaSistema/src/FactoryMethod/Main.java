package FactoryMethod;

public class Main {
    public static void main(String[] args) {

        Teste1 t1 = new Teste1();
        Teste2 t2 = new Teste2();
        Teste3 t3 = new Teste3();

        t1.getMessage();
        t2.getMessage();
        t3.getMessage();

    }
}
