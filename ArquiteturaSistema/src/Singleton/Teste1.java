package Singleton;

public class Teste1 {
    private DbConn dbConn;

    public Teste1() {
        this.dbConn = DbConn.getConnection();
    }

    public void mandarMensagem(String msg) {
        this.dbConn.mandarMensagem(msg);
    }
}