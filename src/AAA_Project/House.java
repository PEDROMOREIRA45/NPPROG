package AAA_Project;

import AAA_Project.Repositories.PropertyTypeEnum;
import AAA_Project.Repositories.SunExposureType;

public class House extends Building {


    private boolean basement;
    private boolean habitableLoft;

    private SunExposureType sunExposure;

    private PropertyTypeEnum type;

    public House(PropertyTypeEnum type, double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, boolean basement, boolean habitableLoft,String street,int zipCode,String stateUS,String city,String district,SunExposureType sunExposure) {
        super(type, areaProperty, distanceCityCenter, numberBedrooms, numberParking, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
        this.sunExposure=sunExposure;
    }

    public House(PropertyTypeEnum type, double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, int numberBathrooms,boolean basement,boolean habitableLoft,String street,int zipCode,String stateUS,String city,String district,SunExposureType sunExposure) {
        super(type, areaProperty, distanceCityCenter, numberBedrooms, numberParking, numberBathrooms, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
        this.sunExposure=sunExposure;
    }

    public House(PropertyTypeEnum type, double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, String availableEquipment,boolean basement,boolean habitableLoft,String street,int zipCode,String stateUS,String city,String district,SunExposureType sunExposure) {
        super(type, areaProperty, distanceCityCenter, numberBedrooms, numberParking, availableEquipment, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
        this.sunExposure=sunExposure;
    }

    public House(PropertyTypeEnum type, double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment,boolean basement,boolean habitableLoft,String street,int zipCode,String stateUS,String city,String district,SunExposureType sunExposure) {
        super(type, areaProperty, distanceCityCenter,numberBedrooms, numberParking, numberBathrooms, availableEquipment, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
        this.sunExposure=sunExposure;

    }

// falta o constructor com SunExposure

    public Boolean getBasement() {
        return basement;
    }

    public Boolean getHabitableLoft() {
        return habitableLoft;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public void setHabitableLoft(boolean habitableLoft) {
        this.habitableLoft = habitableLoft;
    }

    @Override
    public String toString() {
        return String.format("%s ; House{ basement= %b habitableLoft= %b sunExposure= %s type= %s ", super.toString(),basement,habitableLoft,sunExposure,type);
    }

}