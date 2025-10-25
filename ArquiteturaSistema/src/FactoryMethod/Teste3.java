package FactoryMethod;

public class Teste3 {
    private Channel ch;

    public Teste3(){
        ch = ChannelFactory.createPostgreSql();
    }
    public void getMessage(){
        this.ch.getMessage();
    }
}
