package Invoice;

public class MainInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "Gum", 0, 0);
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice.Invoice amount: " + invoice.getInvoiceAmount());
    }
}
