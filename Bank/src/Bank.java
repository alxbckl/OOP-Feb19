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

        // Kunden zahlen ein
        // Kunde0 zahlt 3x50€ auf sein Konto ein
        depositMoney(account0, customer0, 50);
        depositMoney(account0, customer0, 50);
        depositMoney(account0, customer0, 50);
        newLine();

        // Kunde1 zahlt 370€ auf sein Konto ein
        depositMoney(account1, customer1, 370);
        newLine();

        // Kunde 2 zahl 65€ auf sein Konto ein
        depositMoney(account2, customer2, 65000);
        newLine();

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
        System.out.println("Balance:\t" + account.getBalance() + "€");
    }

    // Zahlt Geld auf ein Konto ein
    // Nimmt 2 Parameter an: Welches Konto? Wie viel?
    private void depositMoney(Account account, Customer customer, int amount) {
        account.deposit(amount);
        System.out.println(amount + "€ has been deposited to the account from " + customer.getName() + " " + customer.getLastName() + ".");
    }

    private void newLine() {
        System.out.println();
    }
}
