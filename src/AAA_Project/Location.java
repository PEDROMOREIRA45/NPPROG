package AAA_Project;

import java.time.chrono.IsoEra;

public class Location {
    private String street;
    private int zipCode;
    private String stateUS;
    private String city;
    private String district;

    private final String STREET_OMISSION = "No Adress";
    private final int ZIPCODE_OMISSION = 00000;

    private final String STATEUS_OMISSION="No Adress";
    private final String CITY_OMISSION="No Adress";
    private final String DISTRICT_OMISSION="No Adress";

    public Location (String street, int zipCode, String stateUS, String city, String district ){
        this.street= street;
        this.zipCode= zipCode;
        this.stateUS= stateUS;
        this.city= city;
        this.district= district;
    }

    public Location (){
        this.street= STREET_OMISSION;
        this.zipCode= ZIPCODE_OMISSION;
        this.stateUS= STATEUS_OMISSION;
        this.city= CITY_OMISSION;
        this.district= DISTRICT_OMISSION;
    }

    public String getStreet() {
        return street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStateUS() {
        return stateUS;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setStateUS(String stateUS) {
        this.stateUS = stateUS;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    // a ver o to.String

}
