package AAA_Project;

import AAA_Project.Repositories.PropertyTypeEnum;

public class Building extends Property {
    private int numberBedrooms;
    private int numberParking;
    private int numberBathrooms;
    private String availableEquipment;


/*    public Building(PropertyType type) {
        super(type);
    }
*/
    public Building (PropertyTypeEnum type, double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,String street,int zipCode,String stateUS,String city,String district){
        super(type, areaProperty, distanceCityCenter, street, zipCode, stateUS, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
    }

    public Building (PropertyTypeEnum type, double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,int numberBathrooms,String street,int zipCode,String stateUS,String city,String district){
        super(type, areaProperty, distanceCityCenter, street, zipCode, stateUS, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.numberBathrooms=numberBathrooms;
    }

    public Building (PropertyTypeEnum type, double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,String availableEquipment,String street,int zipCode,String stateUS,String city,String district){
        super(type, areaProperty, distanceCityCenter, street, zipCode, stateUS, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.availableEquipment=availableEquipment;
    }

    public Building (PropertyTypeEnum type, double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment, String street, int zipCode, String stateUS, String city, String district){
        super(type, areaProperty, distanceCityCenter, street, zipCode, stateUS, city, district);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.numberBathrooms=numberBathrooms;
        this.availableEquipment=availableEquipment;
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

    // falta o to.String


    @Override
    public String toString() {
        return String.format("%s ; Building{ numberBedrooms= %d numberParking= %d numberBathrooms=  %d availableEquipment=  %s ", super.toString(),numberBedrooms,numberParking,numberBathrooms,availableEquipment);
    }
}