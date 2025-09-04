public class Contrato implements Pagamento {
    @Override
    public float getSaldo() {
        // Exemplo: retorna o salário de contrato
        return salario();
    }

    private float salario() {
        return 3000f; // apenas exemplo
    }
}