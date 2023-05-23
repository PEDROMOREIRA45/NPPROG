package AAA_Project.domain;

public class BusinessType {

    /**
     * description of a particular BusinessType
     */
    private String description;

    /**
     * creates a businessType instance
     * requires only a string description of the businessType
     * @param description
     */
    public BusinessType(String description){
        this.description = description;
    }

    /**
     * gets the description that is saved to this instance
     * @return the businessType description
     */
    public String getDescription() {
        return description;
    }
}
