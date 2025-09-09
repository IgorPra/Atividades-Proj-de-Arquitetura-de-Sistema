public class CLT implements Pagamento {
    @Override
    public float getSaldo() {
        return salarioBase() + beneficios();
    }

    private float salarioBase() {
        return 4000f;
    }

    private float beneficios() {
        return 800f;
    }
}