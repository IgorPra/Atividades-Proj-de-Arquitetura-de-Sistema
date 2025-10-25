package Singleton;

public class DbConn {
    private static DbConn conn;
    private DbConn() {}
    public static DbConn getConnection() {
        if (conn == null) {
            conn = new DbConn();
        }
        return conn;
    }

    public void mandarMensagem(String msg) {
        System.out.println(msg);
    }
}
