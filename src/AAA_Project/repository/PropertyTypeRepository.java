package AAA_Project.repository;

import AAA_Project.domain.PropertyType;

import java.util.ArrayList;
import java.util.List;

public class PropertyTypeRepository {

    private final List<PropertyType> propertyTypes = new ArrayList<>();

    /**
     * This method returns a defensive (immutable) copy of the list of property types.
     *
     * @return The list of property types.
     */

    public List<PropertyType> getPropertyTypesList() {
        return List.copyOf(propertyTypes);
    }

    public void addPropertyTypes(String propertyType){
        propertyTypes.add(new PropertyType(propertyType));
    }
}
