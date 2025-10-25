package FactoryMethod;

public class ChannelFactory {
    public static Channel createMySql() {
        return new MySQLChannel();
    }

    public static Channel createOracle() {
        return new OracleChannel();
    }

    public static Channel createPostgreSql() {
        return new PostgreSQLChannel();
    }

}
