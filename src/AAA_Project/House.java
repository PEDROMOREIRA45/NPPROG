package AAA_Project;

public class House extends Building {

    //
    private boolean basement;
    private boolean habitableLoft;

    // falta sunexposure (interface? implements)

 /*   public House(PropertyType type) {
        super(type);
    }
  */

    public House(double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, boolean basement, boolean habitableLoft) {
        super(areaProperty, distanceCityCenter, numberBedrooms, numberParking);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
    }

    public House(double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, int numberBathrooms,boolean basement,boolean habitableLoft) {
        super(areaProperty, distanceCityCenter, numberBedrooms, numberParking, numberBathrooms);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
    }

    public House(double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, String availableEquipment,boolean basement,boolean habitableLoft) {
        super(areaProperty, distanceCityCenter, numberBedrooms, numberParking, availableEquipment);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
    }

    public House(double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment,boolean basement,boolean habitableLoft) {
        super(areaProperty, distanceCityCenter,numberBedrooms, numberParking, numberBathrooms, availableEquipment);
        this.basement=basement;
        this.habitableLoft=habitableLoft;
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

// falta o Gettere e Setter SunExposure

// a ver o to.String

}