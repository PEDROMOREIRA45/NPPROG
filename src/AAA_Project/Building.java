package AAA_Project;

public class Building extends Property{
    private int numberBedrooms;
    private int numberParking;
    private int numberBathrooms;
    private String availableEquipment;


/*    public Building(PropertyType type) {
        super(type);
    }
*/
    public Building (double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking){
        super(areaProperty, distanceCityCenter);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
    }

    public Building (double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,int numberBathrooms){
        super(areaProperty, distanceCityCenter);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.numberBathrooms=numberBathrooms;
    }

    public Building (double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,String availableEquipment){
        super(areaProperty, distanceCityCenter);
        this.numberBedrooms=numberBedrooms;
        this.numberParking=numberParking;
        this.availableEquipment=availableEquipment;
    }

    public Building (double areaProperty, double distanceCityCenter,int numberBedrooms,int numberParking,int numberBathrooms,String availableEquipment){
        super(areaProperty, distanceCityCenter);
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


}