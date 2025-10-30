package TemplateMethod;

public class CustomerReport extends ReportGenerator {

    public CustomerReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Carregando o reporte customizado CustomerReport");
    }

    @Override
    public void sortData() {
        System.out.println("Ordenando o reporte customizado CustomerReport");
    }

    @Override
    public void formatData() {
        System.out.println("Formatando o reporte customizado CustomerReport");
    }
}
