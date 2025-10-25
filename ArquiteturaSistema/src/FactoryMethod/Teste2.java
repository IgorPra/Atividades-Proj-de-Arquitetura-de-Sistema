package FactoryMethod;

public class Teste2 {
    private Channel ch;

    public Teste2(){
        ch = ChannelFactory.createMySql();
    }
    public void getMessage(){
        this.ch.getMessage();
    }
}
