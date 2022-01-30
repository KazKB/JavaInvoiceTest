import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class Invoice {
    private static int invoiceNum = 0;
    private Date date = new Date();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    Invoice () {
        System.out.println("Invoice Number: " + ++this.invoiceNum);
        System.out.println("Date: " + formatter.format(this.date));
        System.out.println(Customer.getName());
        System.out.println();
        System.out.println("Items");

        Iterator<String> iterator = Customer.item.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
        System.out.println();

        Customer.item.clear();
    }
}
