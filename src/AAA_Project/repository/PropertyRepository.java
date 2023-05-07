package AAA_Project.repository;

import AAA_Project.domain.*;

import java.util.ArrayList;
import java.util.List;

public class PropertyRepository {

    private static List<Property> properties = new ArrayList<>();

    public static Property createNewHouseProperty(PropertyType keepPropertyType, double keepAreaProperty, double keepDistanceCityCenter, List<String> keepPhotographs, int keepNumberBedrooms, int keepNumberParking, int keepNumberBathrooms, String keepAvailableEquipment, boolean keepBasement, boolean keepLoft, SunExposure keepSunExposure, String keepStreet, String keepZipCode, String keepStateUS, String keepCity, String keepDistrict){
        House newHouseProperty = new House(keepPropertyType, keepAreaProperty, keepDistanceCityCenter, keepPhotographs, keepNumberBedrooms, keepNumberParking, keepNumberBathrooms, keepAvailableEquipment, keepBasement, keepLoft, keepSunExposure, keepStreet, keepZipCode, keepStateUS, keepCity, keepDistrict);
        properties.add(newHouseProperty);
        return newHouseProperty;
    }

    public static Property createNewApartmentProperty(PropertyType keepPropertyType, double keepAreaProperty, double keepDistanceCityCenter, List<String> keepPhotographs, int keepNumberBedrooms, int keepNumberParking, int keepNumberBathrooms, String keepAvailableEquipment, String keepStreet, String keepZipCode, String keepStateUS, String keepCity, String keepDistrict){
        Building newApartmentProperty = new Building(keepPropertyType, keepAreaProperty, keepDistanceCityCenter, keepPhotographs, keepNumberBedrooms, keepNumberParking, keepNumberBathrooms, keepAvailableEquipment, keepStreet, keepZipCode, keepStateUS, keepCity, keepDistrict);
        properties.add(newApartmentProperty);
        return newApartmentProperty;
    }

    public static Property createNewProperty(PropertyType keepPropertyType, double keepAreaProperty, double keepDistanceCityCenter, List<String> keepPhotographs, String keepStreet, String keepZipCode, String keepStateUS, String keepCity, String keepDistrict){
        Property newProperty = new Property(keepPropertyType, keepAreaProperty, keepDistanceCityCenter, keepPhotographs, keepStreet, keepZipCode, keepStateUS, keepCity, keepDistrict);
        properties.add(newProperty);
        return newProperty;
    }

    public static List<Property> getProperties() {
        return properties;
    }
}
