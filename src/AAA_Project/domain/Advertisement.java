package AAA_Project.domain;

public class Advertisement {

    private Property listedproperty;
    private BusinessType businessType;

    public Advertisement(BusinessType type,Property property){
        businessType=type;
        listedproperty=property;
    }

    public Boolean getAdsAndPropertyFilters(BusinessType keepBusinessType, PropertyType keepPropertyType,int keepNumberBedrooms){
        if(keepBusinessType!=businessType){
            return false;
        }
        if(keepPropertyType!= listedproperty.getPropertyType()){
            return false;
        }

        return true;
    }

}
