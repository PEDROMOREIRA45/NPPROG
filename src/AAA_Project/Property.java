package AAA_Project;

import AAA_Project.Repositories.PropertyTypeEnum;

public class Property implements LocationInterface{


    //implements LocationInterface
    private double areaProperty;
    private double distanceCityCenter;
    private PropertyTypeEnum type;
    private String street;
    private int zipCode;
    private String stateUS;
    private String city;
    private String district;

    public Property(PropertyTypeEnum type, double areaProperty, double distanceCityCenter, String street, int zipCode, String stateUS, String city, String district){
        this.type=type;
        this.areaProperty=areaProperty;
        this.street=street;
        this.zipCode=zipCode;
        this.stateUS=stateUS;
        this.city=city;
        this.district=district;
    }

    public PropertyTypeEnum getType() {
        return type;
    }
    public double getAreaProperty() {
        return areaProperty;
    }

    public double getDistanceCityCenter() {
        return distanceCityCenter;
    }

    public PropertyTypeEnum getPropertyType() {
        return type;
    }

    @Override
    public String getStreet() {
        return street;
    }
    @Override
    public int getZipCode() {
        return zipCode;
    }
    @Override
    public String getStateUS() {
        return stateUS;
    }
    @Override
    public String getCity() {
        return city;
    }
    @Override
    public String getDistrict() {
        return district;
    }

    public void setAreaProperty(double areaProperty) {
        this.areaProperty = areaProperty;
    }

    public void setDistanceCityCenter(double distanceCityCenter) {
        this.distanceCityCenter = distanceCityCenter;
    }
    public void setPropertyType(PropertyTypeEnum type) {
        this.type = type;
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

    @Override
    public String toString() {
        return String.format("Property{ areaProperty= %f distanceCityCenter= %f type= %s street= %s zipCode= %d stateUS= %s city= %s district= %s"
                ,areaProperty,distanceCityCenter,type,street,zipCode,stateUS,city,district );

    }
}
