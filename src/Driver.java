import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        Scanner itemScanner = new Scanner(System.in);
        Scanner ansScanner = new Scanner(System.in);
        String name, item;
        Character ans = null;

        do {
            System.out.print("Enter customer's name: ");
            name = nameScanner.nextLine();

            Customer customer = new Customer(name);

            do {
                System.out.print("Enter item to be purchased: ");
                item = itemScanner.nextLine();
                customer.addItem(item);

                System.out.print("Is there another item to be scanned(Y/N): ");
                ans = ansScanner.next().charAt(0);
            } while (ans.equals('y') || ans.equals('Y'));

            System.out.println();
            customer.printInvoice();
            System.out.println();

            System.out.println("Thank you for shopping with us " + Customer.getName());
            System.out.println();

            System.out.print("Is there another customer process(Y/N): ");
            ans = ansScanner.next().charAt(0);

            System.out.println();
        } while (ans.equals('y') || ans.equals('Y'));
    }
}