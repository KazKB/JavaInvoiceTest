import java.util.ArrayList;

public class Customer {
    private static String name;
    static ArrayList<String> item = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(String item) {
        this.item.add(item);
    }

    public void printInvoice () {
        Invoice invoice = new Invoice();
    }
}
