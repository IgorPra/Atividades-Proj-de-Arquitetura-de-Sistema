public class Estagio implements Pagamento {
    @Override
    public float getSaldo() {
        return bolsa();
    }

    private float bolsa() {
        return 1500f;
    }
}