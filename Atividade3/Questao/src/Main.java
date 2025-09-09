public class Main {
    public static void main(String[] args) {
        Folha folhaContrato = new Folha();
        Folha folhaEstagio = new Folha();
        Folha folhaClt = new Folha();


        Pagamento contrato = new Contrato();
        Pagamento estagio = new Estagio();
        Pagamento clt = new CLT();

        folhaContrato.calcular(contrato);
        folhaEstagio.calcular(estagio);
        folhaClt.calcular(clt);

        System.out.println("Salário contrato: " + folhaContrato.getSaldo());
        System.out.println("Bolsa estágio: " + folhaEstagio.getSaldo());
        System.out.println("Salário CLT: " + folhaClt.getSaldo());
    }
}
