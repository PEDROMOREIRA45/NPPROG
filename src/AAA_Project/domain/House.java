package AAA_Project.domain;

import java.util.List;

public class House extends Building{
    /**
     * Shows if the House is Habitable
     */
    private boolean loft;

    /**
     * Shows if there is a basement in the House
     */
    private boolean basement;

    /**
     * Shows which direction the house is exposed to the sun
     */
    private SunExposure sunExposure;

    /**
     * Creates instance with Property Type House, area of the property in square meters,
     * Distance from the Property to the City in Kilometers, Number of Bedrooms in a House,
     * Number of Parking Spaces in a House, Shows if there is a basement in the House,
     * Shows if the House is Habitable, Street were is the House, ZipCode of the location of the House,
     * State in the US were is the House, City were is the House, District were is the House
     * @param propertyType Property Type House
     * @param areaProperty area of the property in square meters
     * @param distanceCityCenter Distance from the Property to the City in Kilometers
     * @param numberBedrooms Number of Bedrooms in a House
     * @param numberParking Number of Parking Spaces in a House
     * @param basement Shows if there is a basement in the House
     * @param loft Shows if the House is Habitable
     * @param street Street were is the House
     * @param zipCode ZipCode of the location of the House
     * @param stateUS State in the US were is the House
     * @param city City were is the House
     * @param district District were is the House
     */
    /* public House(PropertyType propertyType, double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, boolean basement, boolean loft,String street,String zipCode,String stateUS,String city,String district) {
        super(propertyType,areaProperty,distanceCityCenter,numberBedrooms,numberParking,street,zipCode,stateUS,city,district);
        this.basement = basement;
        this.loft = loft;
    } */

    /**
     * Creates instance with Property Type House, District were is the House,
     * Distance from the Property to the City in Kilometers, Number of Bedrooms in a House,
     * Number of Parking Spaces in a House, Number of Bathrooms in the House,
     * Shows if there is a basement in the House, Shows if the House is Habitable,
     * Street were is the House, ZipCode of the location of the House, State in the US were is the House,
     * City were is the House,City were is the House
     * @param propertyType Property Type House
     * @param areaProperty area of the property in square meters
     * @param distanceCityCenter Distance from the Property to the City in Kilometers
     * @param numberBedrooms Number of Bedrooms in a House
     * @param numberParking Number of Parking Spaces in a House
     * @param numberBathrooms Number of Bathrooms in the House
     * @param basement Shows if there is a basement in the House
     * @param loft Shows if the House is Habitable
     * @param street Street were is the House
     * @param zipCode ZipCode of the location of the House
     * @param stateUS State in the US were is the House
     * @param city City were is the House
     * @param district City were is the House
     */
    /* public House(PropertyType propertyType, double areaProperty, double distanceCityCenter,int numberBedrooms, int numberParking, int numberBathrooms,boolean basement,boolean loft,String street,String zipCode,String stateUS,String city,String district) {
        super(propertyType,areaProperty,distanceCityCenter,numberBedrooms,numberParking,numberBathrooms,street,zipCode,stateUS,city,district);
        this.basement=basement;
        this.loft=loft;
    } */

    /**
     * Creates instance with Property Type House, area of the property in square meters,
     * Distance from the Property to the City in Kilometers, Number of Bedrooms in a House,
     * Number of Parking Spaces in a House, Available Equipment (Frige, Air Conditioning, others...) in a House,
     * Shows if there is a basement in the House, Shows if the House is Habitable,
     * Street were is the House, ZipCode of the location of the House, State in the US were is the House,
     * City were is the House, District were is the House
     * @param propertyType Property Type House
     * @param areaProperty area of the property in square meters
     * @param distanceCityCenter Distance from the Property to the City in Kilometers
     * @param numberBedrooms Number of Bedrooms in a House
     * @param numberParking Number of Parking Spaces in a House
     * @param availableEquipment Available Equipment (Frige, Air Conditioning, others...) in a House
     * @param basement Shows if there is a basement in the House
     * @param loft Shows if the House is Habitable
     * @param street Street were is the House
     * @param zipCode ZipCode of the location of the House
     * @param stateUS State in the US were is the House
     * @param city City were is the House
     * @param district District were is the House
     */
    /* public House(PropertyType propertyType, double areaProperty, double distanceCityCenter, int numberBedrooms, int numberParking, String availableEquipment,boolean basement,boolean loft,String street,String zipCode,String stateUS,String city,String district) {
        super(propertyType, areaProperty, distanceCityCenter, numberBedrooms, numberParking, availableEquipment, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.loft=loft;
    } */

    /**
     * Creates instance with Property Type House, area of the property in square meters,
     * Distance from the Property to the City in Kilometers, Number of Bedrooms in a House,
     * Number of Parking Spaces in a House , Number of Bathrooms in the House,
     * Available Equipment (Frige, Air Conditioning, others...) in a House,
     * Shows if there is a basement in the House, Shows if the House is Habitable,
     * Street were is the House, ZipCode of the location of the House, State in the US were is the House,
     * City were is the House, District were is the House
     * @param propertyType Property Type House
     * @param areaProperty area of the property in square meters
     * @param distanceCityCenter Distance from the Property to the City in Kilometers
     * @param numberBedrooms Number of Bedrooms in a House
     * @param numberParking Number of Parking Spaces in a House
     * @param numberBathrooms Number of Bathrooms in the House
     * @param availableEquipment Available Equipment (Frige, Air Conditioning, others...) in a House
     * @param basement Shows if there is a basement in the House
     * @param loft Shows if there is a abitable
     * @param street Street were is the House
     * @param zipCode ZipCode of the location of the House
     * @param stateUS State in the US were is the House
     * @param city City were is the House
     * @param district District were is the House
     */
    public House(PropertyType propertyType, double areaProperty, List<String> photographs, double distanceCityCenter, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment, boolean basement, boolean loft, String street, String zipCode, String stateUS, String city, String district) {
        super(propertyType, areaProperty, distanceCityCenter, photographs, numberBedrooms, numberParking, numberBathrooms, availableEquipment, street, zipCode, stateUS, city, district);
        this.basement=basement;
        this.loft=loft;
    }

    /**
     * Creates instance with Property Type House, area of the property in square meters,
     * Distance from the Property to the City in Kilometers, Number of Bedrooms in a House,
     * Number of Parking Spaces in a House , Number of Bathrooms in the House,
     * Available Equipment (Frige, Air Conditioning, others...) in a House,
     * Shows if there is a basement in the House, Shows if the House is Habitable,
     * Street were is the House, ZipCode of the location of the House, State in the US were is the House,
     * City were is the House, District were is the House
     * @param propertyType Property Type House
     * @param areaProperty area of the property in square meters
     * @param distanceCityCenter Distance from the Property to the City in Kilometers
     * @param numberBedrooms Number of Bedrooms in a House
     * @param numberParking Number of Parking Spaces in a House
     * @param numberBathrooms Number of Bathrooms in the House
     * @param availableEquipment Available Equipment (Frige, Air Conditioning, others...) in a House
     * @param basement Shows if there is a basement in the House
     * @param loft Shows if the House is Habitable
     * @param sunExposure Direction of Sun Exposure
     * @param street Street were is the House
     * @param zipCode ZipCode of the location of the House
     * @param stateUS State in the US were is the House
     * @param city City were is the House
     * @param district District were is the House
     */
    public House(PropertyType propertyType, double areaProperty, double distanceCityCenter, List<String> photographs, int numberBedrooms, int numberParking, int numberBathrooms, String availableEquipment, boolean basement, boolean loft, SunExposure sunExposure, String street, String zipCode, String stateUS, String city, String district) {
        super(propertyType, areaProperty, distanceCityCenter, photographs, numberBedrooms, numberParking, numberBathrooms, availableEquipment, street, zipCode, stateUS, city, district);
        this.basement = basement;
        this.loft = loft;
        this.sunExposure = sunExposure;
    }

    /**
     * Returns True if there is a basement in the House
     * @return rue if there is a basement in the House
     */
    public Boolean getBasement() {
        return basement;
    }

    /**
     * Returns True if the House is Habitable
     * @return True if the House is Habitable
     */
    public Boolean getloft() {
        return loft;
    }

    /**
     * Returns Direction of Sun Exposure
     * @return Direction of Sun Exposure
     */
    public SunExposure getSunExposure() { return sunExposure;}

    /**
     * Modifies acording to the existence or not of a basement in the House
     * @param basement existence or not of a basement
     */
    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    /**
     * Modifies acording to the House beeing Habitable or not
     * @param loft House beeing Habitable or not
     */
    public void setloft(boolean loft) {
        this.loft = loft;
    }

}
