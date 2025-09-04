public class Main {
    public static void main(String[] args) {
        Folha folha = new Folha();

        Pagamento contrato = new Contrato();
        Pagamento estagio = new Estagio();
        Pagamento clt = new CLT();

        System.out.println("Salário contrato: " + folha.calcular(contrato));
        System.out.println("Bolsa estágio: " + folha.calcular(estagio));
        System.out.println("Salário CLT: " + folha.calcular(clt));
    }
}
