// Importieren des Scanners
import java.util.Scanner;

// Importieren der Arraylist
import java.util.ArrayList;

public class Bank {
    // Attribute
    // Wir erinnern uns an die Deklaration von Variablen
    // Datentyp Variablennamen
    // Bei Objekten ist das ganz ähnlich
    // Klassennamen Objektnamen
    // Kunde Objektc
    Customer customer0 = new Customer();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    ArrayList<Customer> customers = new ArrayList<Customer>();


    // Konto Objekt
    Account account0 = new Account();
    Account account1 = new Account();
    Account account2 = new Account();

    ArrayList<Account> accounts = new ArrayList<Account>();

    // Scanner
    Scanner sc = new Scanner(System.in);

    // Zustandasvariable
    int state = 0;

    // Zustände definieren
    final int WELCOME = 0;  // Bank eröffnen
    final int MENU = 1;     // Auswahlmenü, was soll gemacht werden?
    final int NEWCUST = 2;  // Neuen Kunden anlegen
    final int WITHDRAW = 3; // Geld abheben
    final int DEPOSIT = 4;  // Geld einzahlen
    final int TRANSFER = 5; // Geld überweisen
    final int AGAIN = 6;    // Weiter Aktionen?
    final int CLOSE = 7;    // Bank schließen


    // Methoden
    public void start() {
//        System.out.println("Comcave Bank");
//        newLine();
//
//        // Kunde geht in die Bank und eröffnet neues Konto.
//        // Kunde 0
//        makeNewCustomer(customer0, "Max", "Mustermann", 0000);
//        makeNewAccount(account0, 1000, 0000);
//        // Kunde 1
//        makeNewCustomer(customer1, "Peter", "Pan", 0001);
//        makeNewAccount(account1, 1001, 0001);
//        // Kunde 2
//        makeNewCustomer(customer2, "Martha", "Maier", 0002);
//        makeNewAccount(account2, 1002, 0002);
//
//        // Kunden zahlen ein
//        // Kunde0 zahlt 3x50€ auf sein Konto ein
//        depositMoney(account0, customer0, 50);
//        depositMoney(account0, customer0, 50);
//        depositMoney(account0, customer0, 50);
//        newLine();
//
//        // Kunde1 zahlt 370€ auf sein Konto ein
//        depositMoney(account1, customer1, 370);
//        withdrawMoney(account1, customer1, 550);
//
//        newLine();
//
//        // Kunde 2 zahl 65€ auf sein Konto ein
//        depositMoney(account2, customer2, 65000);
//        withdrawMoney(account2, customer2, 12000);
//
//        newLine();
//
//        // Kundeninfo ausgeben
//        printCustomerInfo(customer0);
//        printAccountInfo(account0);
//        newLine();
//
//        printCustomerInfo(customer1);
//        printAccountInfo(account1);
//        newLine();
//
//        printCustomerInfo(customer2);
//        printAccountInfo(account2);
//        newLine();
//
//        transferMoney(account0, account1, customer0, customer1, 5);
//        newLine();
//
//        printCustomerInfo(customer0);
//        printAccountInfo(account0);
//        newLine();
//
//        printCustomerInfo(customer1);
//        printAccountInfo(account1);
//        newLine();
//
//        printCustomerInfo(customer2);
//        printAccountInfo(account2);
//        newLine();

        // Zustandsautomat
        // Mögliche Zustände:
        // Eröffnen der Bank
        // Erstellen eines neuen Kunden - Optional: Automatische Konten- und Kundennummernvergabe static als Hinweis
        // Eingabe des Namens / der Kontonummer
        // Auswahl der Optionen: Auszahlen, Einzahlen, Überweisen
        // Nochmal?
        // Programm beenden

        while(state <= CLOSE) {
            switch(state) {
                case WELCOME:
                    welcome();
                    state = MENU;
                    break;
                case MENU:

                    makeNewCustomer(new Customer(), "Peter", "Pan", 12);
                    break;
                case NEWCUST:

                    break;
                case WITHDRAW:

                    break;
                case DEPOSIT:

                    break;
                case TRANSFER:

                    break;
                case AGAIN:

                    break;
                case CLOSE:

                    break;
            }
        }

    }

    private void welcome() {
        System.out.println("Comcave Bank");
        System.out.println("Herzlich willkommen!");
        newLine();
    }

    private void makeNewCustomer(Customer customer, String name, String lastName, int customerID) {
        customer.initCustomer(name, lastName, customerID);
        customers.add(customer);
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
        System.out.println(amount + "€ has been deposited to the account of " + customer.getName() + " " + customer.getLastName() + ".");
    }

    private void withdrawMoney(Account account, Customer customer, int amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println(amount + "€ has been withdrawn from the account of " + customer.getName() + " " + customer.getLastName() + ".");
        } else {

            System.out.println("There is not enough credit to withdraw " + amount + "€ on the account of " + customer.getName() + " " + customer.getLastName() + "!");
            System.out.println(account.getBalance() + " has been withdrawn!");
            account.withdraw(account.getBalance());
        }
    }

    private void transferMoney(Account sourceAccount, Account destinationAccount,
           Customer sourceCustomer, Customer destinationCustomer, int amount) {
        // Geld soll von sourceAccount auf destinationAccount überwiesen werden.
        // Dazu müssen wir prüfen, ob der sourceAccount genug Guthaben hat.
        // Wenn ja, dann wird überwiesen
        // Wenn nein, dann soll Meldung gegeben werden, dass nicht genug Guthaben vorhanden ist.

        if(sourceAccount.getBalance() >= amount) {
            // Geld soll von sourceAccount abgehoben werden
            sourceAccount.withdraw(amount);
            // und dem destination Account gutgeschrieben werden.
            destinationAccount.deposit(amount);
            // Ausgeben von wem und an wen und wie viel
            // "240€ has been transfered from Peter Pan to Martha Meier."
            System.out.println(amount + "€ has been transfered from " +
                    sourceCustomer.getName() + " " + sourceCustomer.getLastName() + " to " +
                    destinationCustomer.getName() + " " + destinationCustomer.getLastName() + ".");
        }
        else {
            // There is not enough credit on the account of Marta Meiner to transfer 200€ to Peter Pan.
            System.out.println("There is not enough credit on the account of " +
                    sourceCustomer.getName() + " " + sourceCustomer.getLastName() + " to transfer " +
                    amount + "€ to " + destinationCustomer.getName() + " " + destinationCustomer.getLastName() + ".");
        }

    }

    private void newLine() {
        System.out.println();
    }
}
