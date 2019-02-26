public class Bank {
    // Attribute
    // Wir erinnern uns an die Deklaration von Variablen
    // Datentyp Variablennamen
    // Bei Objekten ist das ganz ähnlich
    // Klassennamen Objektnamen
    // Kunde Objekt
    Customer customer0 = new Customer();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    // Konto Objekt
    Account account0 = new Account();
    Account account1 = new Account();
    Account account2 = new Account();

    // Methoden
    public void start() {
        System.out.println("Comcave Bank");
        newLine();

        // Kunde geht in die Bank und eröffnet neues Konto.
        // Kunde 0
        makeNewCustomer(customer0,"Max", "Mustermann", 0000);
        makeNewAccount(account0, 1000, 0000);
        // Kunde 1
        makeNewCustomer(customer1,"Peter", "Pan", 0001);
        makeNewAccount(account1, 1001, 0001);
        // Kunde 2
        makeNewCustomer(customer2,"Martha", "Maier", 0002);
        makeNewAccount(account2, 1002, 0002);

        // Kundeninfo ausgeben
        printCustomerInfo(customer0);
        printAccountInfo(account0);
        newLine();

        printCustomerInfo(customer1);
        printAccountInfo(account1);
        newLine();

        printCustomerInfo(customer2);
        printAccountInfo(account2);
        newLine();
    }

    private void makeNewCustomer(Customer customer, String name, String lastName, int customerID) {
        customer.initCustomer(name, lastName, customerID);
    }

    private void makeNewAccount(Account account, int accountID, int customerID) {
        // Aufruf von initAccount
        account.initAccount(accountID, customerID);
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

    private void newLine() {
        System.out.println();
    }
}
