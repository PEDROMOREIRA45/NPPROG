package AAA_Project.domain;

import AAA_Project.utils.Email;

public class Person {
    private Email email;

    private String name;

    private int numberCitizen;

    private int tin;

    private int phoneNumber;

    private Location location;

    public Person(String email, String name, int numberCitizen, int tin, int phoneNumber, Location location) {
        this.email = new Email(email);
        this.name = name;
        if(validateInputs(numberCitizen) && validateInputs(tin) && validateInputs(phoneNumber)){
            this.numberCitizen = numberCitizen;
            this.tin = tin;
            this.phoneNumber = phoneNumber;
        }else{
            throw new IllegalArgumentException("Arguments are not valid, please try again.");
        }
        this.location = location;
    }


    public Person(String name, String email, int numberCitizen, int tin, int phoneNumber) {
        this.name = name;
        this.email = new Email(email);
        if(validateInputs(numberCitizen) && validateInputs(tin) && validateInputs(phoneNumber)){
            this.numberCitizen = numberCitizen;
            this.tin = tin;
            this.phoneNumber = phoneNumber;
        }else{
            throw new IllegalArgumentException("Arguments are not valid, please try again.");
        }
    }


    public Email getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = new Email(email);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getNumberCitizen() {
        return numberCitizen;
    }


    public void setNumberCitizen(int numberCitizen) {
        if(validateInputs(numberCitizen))  this.numberCitizen = numberCitizen;
    }


    public int getTin() {
        return tin;
    }


    public void setTin(int tin) {
        if(validateInputs(tin)) this.tin = tin;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(int phoneNumber) {
        if(validateInputs(phoneNumber)) this.phoneNumber = phoneNumber;
    }


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object obj) {
        return this.getEmail().equals(((Person)obj).getEmail());
    }

    public boolean validateInputs(int value){
        return (value > 100000000 && value < 999999999);
    }
}
