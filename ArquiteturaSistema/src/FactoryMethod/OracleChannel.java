package FactoryMethod;

public class OracleChannel implements Channel{

    public void getMessage(){
        System.out.println("Conexao com Oracle");
    }
}
