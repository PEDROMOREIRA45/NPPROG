package AAA_Project.domain;

import java.util.List;

public class Building extends Property {

    private int numberBedrooms;

    private int numberParking;

    private int numberBathrooms;

    private String availableEquipment;


    /* public Building (PropertyType propertyType, double area, double distanceCityCenter, int numberBedrooms, int numberParking, String street, String zip, String state, String city, String district) {
        super(propertyType, area, distanceCityCenter, street, zip, state, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
    } */


    /* public Building (PropertyType propertyType, double area, double distanceCityCenter,int numberBedrooms,int numberParking,int numberBathrooms,String street,String zip,String state,String city,String district){
        super(propertyType, area, distanceCityCenter, street, zip, state, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.numberBathrooms=numberBathrooms;
    } */


    /* public Building (PropertyType propertyType, double area, double distanceCityCenter, int numberBedrooms,int numberParking,String availableEquipment,String street,String zip,String state,String city,String district){
        super(propertyType, area, distanceCityCenter, street, zip, state, city, district);
        this.numberBedrooms = numberBedrooms;
        this.numberParking = numberParking;
        this.availableEquipment = availableEquipment;
    } */



    public Building(PropertyType propertyType, double area, double distanceCityCenter, List<String> photographs, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment, String street, String zip, String state, String city, String district) {
        super(propertyType, area, distanceCityCenter, photographs, street, zip, state, city, district);
        if (!validateBuilding(numberBedrooms, numberParking, numberBathrooms, availableEquipment))
            throw new IllegalArgumentException("Building arguments are not valid, please try again.");
        this.numberBedrooms = numberBedrooms;
        this.numberParking = numberParking;
        this.numberBathrooms = numberBathrooms;
        this.availableEquipment = availableEquipment;
    }

    private boolean validateBuilding(int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment) {
        return !(numberBedrooms < 0 || numberParking < 0 || numberBathrooms < 0);
    }

    public int getNumberBedrooms() {
        return numberBedrooms;
    }


    public int getNumberParking() {
        return numberParking;
    }


    public int getNumberBathrooms() {
        return numberBathrooms;
    }


    public String getAvailableEquipment() {
        return availableEquipment;
    }


    public void setNumberBedrooms(int numberBedrooms) {
        this.numberBedrooms = numberBedrooms;
    }


    public void setNumberParking(int numberParking) {
        this.numberParking = numberParking;
    }


    public void setNumberBathrooms(int numberBathrooms) {
        this.numberBathrooms = numberBathrooms;
    }

     public void setAvailableEquipment(String availableEquipment) {
        this.availableEquipment = availableEquipment;
    }

    
}


// falta o to.String
