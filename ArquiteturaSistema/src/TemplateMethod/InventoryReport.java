package TemplateMethod;

public class InventoryReport extends ReportGenerator {

    public InventoryReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Carregando o reporte customizado InventoryReport");
    }

    @Override
    public void sortData() {
        System.out.println("Ordenando o reporte customizado InventoryReport");
    }

    @Override
    public void formatData() {
        System.out.println("Formatando o reporte customizado InventoryReport");
    }
}
