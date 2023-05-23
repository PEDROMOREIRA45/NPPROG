package AAA_Project.domain;

public class PropertyType {
    /**
     * Shows a particular Property Type
     */
    private String description;

    /**
     * Creates instance with a particular Property Type
     * @param description a particular Property Type
     */
    public PropertyType (String description){
        this.description=description;
    }

    /**
     * Returns a particular Property Type
     * @return a particular Property Type
     */
    public String getDescription() {
        return description;
    }

}
