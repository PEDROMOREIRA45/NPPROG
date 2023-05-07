package AAA_Project.domain;

public class CommissionType {
    /**
     * Shows description of the Comission Type
     */
    private String description;

    /**
     * Creates instance with description of the Comission Type
     * @param description description of the Comission Type
     */
    public CommissionType (String description){
        this.description=description;
    }

    /**
     * Returns description of the Comission Type.
     * @return description of the Comission Type.
     */
    public String getDescription() {
        return description;
    }


}
