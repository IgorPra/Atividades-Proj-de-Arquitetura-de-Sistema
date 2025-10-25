package FactoryMethod;

public class Teste1 {
    private Channel ch;

    public Teste1(){
        ch = ChannelFactory.createOracle();
    }

    public void getMessage(){
        this.ch.getMessage();
    }
}
