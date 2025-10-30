package TemplateMethod;

public abstract class ReportGenerator {

    public ReportGenerator() {}

    public void generateReport() {
        loadData();
        sortData();
        formatData();
        System.out.println("--- Relatório Gerado com Sucesso --- \n");
    }

    public void loadData() {
        System.out.println("Carregando");
    }

    public void sortData() {
        System.out.println("Ordenando");
    }

    public void formatData() {
        System.out.println("Formatando");
    }
}
