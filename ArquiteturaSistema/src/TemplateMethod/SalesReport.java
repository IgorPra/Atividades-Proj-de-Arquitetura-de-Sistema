package TemplateMethod;

public class SalesReport extends ReportGenerator{
    public SalesReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Carregando o reporte customizado SalesReport");
    }

    @Override
    public void sortData() {
        System.out.println("Ordenando o reporte customizado SalesReport");
    }

    @Override
    public void formatData() {
        System.out.println("Formatando o reporte customizado SalesReport");
    }
}
