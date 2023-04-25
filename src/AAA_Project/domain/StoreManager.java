package AAA_Project.domain;

public class StoreManager extends Employee implements PersonInterface{

    private String email;
    private int numberCitizen;
    private int tin;
    private int phoneNumber;
    private String name;
    private final String prefix = "STORE_MANAGER";
    private static int numAgent = 0;

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

    public StoreManager(String email,int numberCitizen, int tin,int phoneNumber, String name ) {
        super("AGENT"+(++numAgent),email,numberCitizen,tin,phoneNumber,name );
    }



}
