public class Customer {
    // Customer ID
    private int customerID;
    // Name
    private String name;
    private String lastName;
    // Address
    private int postCode;
    private String city;
    private String street;
    private int houseNumber;

    public Customer() {
        System.out.println("One customer has been added.");
    }

    // Init Customer
    public void initCustomer(String name, String lastName, int customerID) {
        this.name = name;
        this.lastName = lastName;
        this.customerID = customerID;
    }

    // Getter
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPostCode() {
        return postCode;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public int getCustomerID() {
        return customerID;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
