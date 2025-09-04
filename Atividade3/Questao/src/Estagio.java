public class Estagio implements Pagamento {
    @Override
    public float getSaldo() {
        // Exemplo: retorna a bolsa do estagiário
        return bolsa();
    }

    private float bolsa() {
        return 1500f; // apenas exemplo
    }
}