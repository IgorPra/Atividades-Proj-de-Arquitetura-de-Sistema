public class Contrato implements Pagamento {
    @Override
    public float getSaldo() {
        return salario();
    }

    private float salario() {
        return 3000f;
    }
}