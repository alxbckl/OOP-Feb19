public class Bank {
    // Attribute
    // Kunde Objekt
    Customer customer0 = new Customer();
    // Konto Objekt
    Account account0;

    // Methoden
    public void start() {
        System.out.println("Comcave Bank");

        // Kunde geht in die Bank und eröffnet neues Konto.
        makeNewCustomer("Max", "Mustermann", 142305);
        makeNewAccount(0136, 142305);

        // Kundeninfo ausgeben
        printCustomerInfo(customer0);
        printAccountInfo(account0);
    }

    private void makeNewCustomer(String name, String lastName, int customerID) {
        customer0.setName(name);
        customer0.setLastName(lastName);
        customer0.setCustomerID(customerID);
    }

    private void makeNewAccount(int accountID, int customerID) {
        // Konstruktor Aufruf
        account0 = new Account(accountID, customerID);
    }

    private void printCustomerInfo(Customer customer) {
        System.out.println("Name:\t\t" + customer.getName());
        System.out.println("Lastname:\t" + customer.getLastName());
        System.out.println("CustomerID:\t" + customer.getCustomerID());
    }

    private void printAccountInfo(Account account) {
        System.out.println("AccountID:\t" + account.getAccountID());
        System.out.println("Balance:\t" + account.getBalance());

    }
}
