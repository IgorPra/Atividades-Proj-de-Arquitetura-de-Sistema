package Singleton;

public class Teste2 {
    private DbConn dbConn;

    public Teste2() {
        this.dbConn = DbConn.getConnection();
    }

    public void mandarMensagem(String msg) {
        this.dbConn.mandarMensagem(msg);
    }
}
