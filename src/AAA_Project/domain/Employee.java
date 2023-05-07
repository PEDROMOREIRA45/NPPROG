package AAA_Project.domain;


public class Employee extends Person{
    /**
     * Shows the employee Role in the Company
     */
    private String role;

    /**
     * Creates instance of Employee with Person's Email, Person's name, Person's Citizen Number,
     * Person's Financial identification (tin), Person's  phone Number,
     * Person's location (Street, Zip Code, State, City, District), Person's role in Company
     * @param email Person's Email
     * @param name Person's name
     * @param numberCitizen Person's Citizen Number
     * @param tin Person's Financial identification (tin)
     * @param phoneNumber Person's  phone Number
     * @param location Person's location (Street, Zip Code, State, City, District)
     * @param role Person's role in Company
     */
    public Employee(String name, String email, int numberCitizen, int tin, int phoneNumber, Location location, String role) {
        super(name, email, numberCitizen, tin, phoneNumber, location);
        this.role = role;
    }

    /**
     * Creates instance of Employee with Person's Email, Person's name, Person's Citizen Number,
     * Person's Financial identification (tin), Person's  phone Number,
     * Person's location (Street, Zip Code, State, City, District), Person's role in Company
     * @param name Person's name
     * @param email Person's Email
     * @param numberCitizen Person's Citizen Number
     * @param tin Person's Financial identification (tin)
     * @param phoneNumber Person's  phone Number
     * @param role Person's role in Company
     */
    public Employee(String name, String email, int numberCitizen, int tin, int phoneNumber, String role) {
        super(name, email, numberCitizen, tin, phoneNumber);
        this.role = role;
    }

    /**
     * Returns Person's role in Company
     * @return Person's role in Company
     */
    public String getRole() {
        return role;
    }

    /**
     * Modifies acording Person's role in Company
     * @param role Person's role in Company
     */
    public void setRole(String role) {
        this.role = role;
    }
}
