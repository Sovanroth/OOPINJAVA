public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 2, 9.99);

        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        invoice.setQuantity(3);
        invoice.setPricePerItem(14.99);

        System.out.println("New quantity: " + invoice.getQuantity());
        System.out.println("New price per item: " + invoice.getPricePerItem());
        System.out.println("New invoice amount: " + invoice.getInvoiceAmount());
    }
}
