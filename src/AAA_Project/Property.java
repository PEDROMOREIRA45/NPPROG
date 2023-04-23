package AAA_Project;

public class Property {

    private double areaProperty;
    private double distanceCityCenter;

//    private final PropertyType propertyType;



/*    public Property(PropertyType type){
        propertyType=type;
    }
*/

/*    public PropertyType getPropertyType() {
        return propertyType;
    }
*/

    public Property(double areaProperty,double distanceCityCenter ){
        this.areaProperty=areaProperty;
        this.distanceCityCenter=distanceCityCenter;
    }

    public double getAreaProperty() {
        return areaProperty;
    }

    public double getDistanceCityCenter() {
        return distanceCityCenter;
    }

    public void setAreaProperty(double areaProperty) {
        this.areaProperty = areaProperty;
    }

    public void setDistanceCityCenter(double distanceCityCenter) {
        this.distanceCityCenter = distanceCityCenter;
    }


}
