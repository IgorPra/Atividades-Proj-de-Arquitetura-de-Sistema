public class DBConn {
    private DBConn() {}
    private static DBConn instance;
    public static DBConn getInstance() {
        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }
    public void println(String msg){
        System.out.println(msg);
    }
}
