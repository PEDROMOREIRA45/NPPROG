package AAA_Project.domain;

import java.util.ArrayList;
import java.util.List;

public class Store {


    private final String prefix ="STR";


    private static int numStores =0;


    private String name;


    private String emailAddress;


    private int phoneNumber;


    private String idStore;



    private List<Employee> employeeList = new ArrayList<>();



    public Store (String name, String emailAddress,int phoneNumber){
        idStore=prefix+(++numStores);
        this.name=name;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        listedProperties=new ArrayList<>();
    }


    public String getIdStore() {
        return idStore;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    private List<Advertisement> listedProperties;


    public List<Advertisement> getListedProperties(BusinessType keepBusinessType,PropertyType keepPropertyType,int keepNumberBedrooms){
        List<Advertisement> filteredProperties=new ArrayList<>();
        if(!listedProperties.isEmpty()) {
            for (Advertisement a : listedProperties) {
                if (a.getAdsAndPropertyFilters(keepBusinessType, keepPropertyType, keepNumberBedrooms)) {
                    filteredProperties.add(a);
                }
            }
        }
        return filteredProperties;
    }


    public List<Employee> getEmployeeList() {
        return employeeList;
    }


    public void addEmployeeToStore(Employee employee){
        employeeList.add(employee);
    }

}
