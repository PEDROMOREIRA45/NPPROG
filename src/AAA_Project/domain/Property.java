package AAA_Project.domain;

import java.util.List;

public class Property {


    private PropertyType propertyType;


    private double area;


    private double distance;


    private Location location;
    private List<String> photographs;

    public Property(PropertyType propertyType, double area, double distance, List<String> photographs, String street, String zip, String state, String city, String district) {
        if (!validateProperty(propertyType, area, distance))
            throw new IllegalArgumentException("Property arguments are not valid, please try again.");
        this.location  =  new Location(street, zip, state, city, district);
        this.propertyType = propertyType;
        this.area = area;
        this.distance = distance;
    }


    public Property(PropertyType propertyType, double area, double distance, String street, String zip, String state, String city, String district) {
        if (!validateProperty(propertyType, area, distance))
            throw new IllegalArgumentException("Property arguments are not valid, please try again.");
        this.location  =  new Location(street, zip, state, city, district);
        this.propertyType = propertyType;
        this.area = area;
        this.distance = distance;
    }

    private boolean validateProperty(PropertyType propertyType, double area, double distance) {
        return !(area <= 0) && !(distance < 0);
    }

    public Property(PropertyType propertyType,double area,double distance){
        this.propertyType=propertyType;
        this.area=area;
        this.distance=distance;
    }


    public double getArea() {
        return area;
    }


    public double getdistance() {
        return distance;
    }


    public PropertyType getPropertyType() {
        return propertyType;
    }


    public String getStreet() {
        return location.getStreet();
    }


    public String getZip() {
        return location.getZip();
    }


    public String getState() {
        return location.getState();
    }


    public String getCity() {
        return location.getCity();
    }


    public String getDistrict() {
        return location.getDistrict();
    }


    public List<String> getPhotographs() { return photographs;}

    public double getDistance() {
        return distance;
    }

    public Location getLocation() {
        return location;
    }
}
