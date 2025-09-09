public class Folha {

    private float saldo;

    public void calcular(Pagamento f) {
        this.saldo = f.getSaldo();
    }

    public float getSaldo() {
        return saldo;
    }
}
