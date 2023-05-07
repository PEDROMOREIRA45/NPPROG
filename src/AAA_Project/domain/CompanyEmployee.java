package AAA_Project.domain;

import AAA_Project.utils.Email;

public class CompanyEmployee implements PersonInterface{

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public int getNumberCitizen() {
        return 0;
    }

    @Override
    public int getTin() {
        return 0;
    }

    @Override
    public int getPhoneNumber() {
        return 0;
    }
    @Override
    public String getName() {
        return null;
    }

    public CompanyEmployee (String name, String email, int numberCitizen, int tin, int phoneNumber, Location location, String role) {
        Email email1 = new Email(email);
        if(validateInputs(numberCitizen) && validateInputs(tin) && validateInputs(phoneNumber)){
        }else{
            throw new IllegalArgumentException("Arguments are not valid, please try again.");
        }
    }

    public CompanyEmployee(String name, String email, int numberCitizen, int tin, int phoneNumber, String role) {
        if(validateInputs(numberCitizen) && validateInputs(tin) && validateInputs(phoneNumber)){
        }else{
            throw new IllegalArgumentException("Arguments are not valid, please try again.");
        }
    }

    public boolean validateInputs(int value){
        return (value > 100000000 && value < 999999999);
    }

}
