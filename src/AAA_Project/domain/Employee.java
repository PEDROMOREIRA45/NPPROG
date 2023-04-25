package AAA_Project.domain;

public abstract class Employee implements PersonInterface {
    private String email;
    private int numberCitizen;
    private int tin;
    private int phoneNumber;
    private String name;

    private String position;

    @Override
    public String getEmailAddress() {
        return email;
    }

    @Override
    public int getNumberCitizen() {
        return numberCitizen;
    }

    @Override
    public int getTin() {
        return tin;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public Employee(String position, String email, int numberCitizen,int tin, int phoneNumber, String name ) {
        this.position=position;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
