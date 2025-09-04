public class CLT implements Pagamento {
    @Override
    public float getSaldo() {
        // Exemplo: retorna salário + benefícios
        return salarioBase() + beneficios();
    }

    private float salarioBase() {
        return 4000f; // exemplo
    }

    private float beneficios() {
        return 800f; // exemplo
    }
}