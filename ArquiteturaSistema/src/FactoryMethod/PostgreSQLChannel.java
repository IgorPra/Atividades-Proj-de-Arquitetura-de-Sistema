package FactoryMethod;

public class PostgreSQLChannel implements Channel{

    public void getMessage(){
        System.out.println("Conexao com PostgreSQL");
    }
}
