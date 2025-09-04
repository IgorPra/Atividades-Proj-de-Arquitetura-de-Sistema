class Folha {
    protected float saldo;

    public float calcular(Pagamento p) {
        this.saldo = p.getSaldo();
        return this.saldo;
    }
}