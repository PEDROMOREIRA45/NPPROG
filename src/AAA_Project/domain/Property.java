package AAA_Project.domain;

import AAA_Project.Repositories.PropertyTypeEnum;

public class Property implements LocationInterface{

    private PropertyType propertyType;
    private double areaProperty;
    private double distanceCityCenter;

    private String street;
    private int zipCode;
    private String stateUS;
    private String city;
    private String district;

    public Property(PropertyType type,double areaProperty,double distanceCityCenter,String street,int zipCode,String stateUS,String city,String district){
        this.propertyType=type;
        this.areaProperty=areaProperty;
        this.distanceCityCenter=distanceCityCenter;
        this.street=street;
        this.zipCode=zipCode;
        this.stateUS=stateUS;
        this.city=city;
        this.district=district;
    }
    public double getAreaProperty() {
        return areaProperty;
    }

    public double getDistanceCityCenter() {
        return distanceCityCenter;
    }

    public PropertyType getPropertyType() {
        return propertyType;
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
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
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
}
