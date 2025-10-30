package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.generateReport();

        SalesReport salesReport = new SalesReport();
        salesReport.generateReport();

        CustomerReport customerReport = new CustomerReport();
        customerReport.generateReport();

    }
}
