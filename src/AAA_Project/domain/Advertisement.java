package AAA_Project.domain;

import java.util.Date;

public class Advertisement {

    private Date date;


    private Request request;


    private CommissionType commissionType;


    private double commissionValue;

    /**
     * Creates an instance of Advertisement
     * requires a request instance, a commissionType, and a commissionValue
     * @param request
     * @param commissionType
     * @param commissionValue
     */
    public Advertisement(Request request, CommissionType commissionType, double commissionValue) {
        this.request = request;
        this.commissionType = commissionType;
        this.commissionValue = commissionValue;
    }

    /**
     * Creates an instance of Advertisement
     */
    public Advertisement() {
    }

    /**
     * Returns request
     * @return request
     */
    public Request getRequest() { return request;}

    /**
     * Return commission type
     * @return commissionType
     */
    public CommissionType getCommissionType() { return commissionType;}

    /**
     * Return commission value
     * @return commission value
     */
    public double getCommissionValue() { return commissionValue;}

    /**
     * Returns date of advertisemente
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Creates instance with a commission type , a date and a comissionValue
     * @param commissionType
     * @param date
     * @param commissionValue
     */
    public Advertisement(CommissionType commissionType, Date date, Double commissionValue){
        this.commissionType=commissionType;
        this.date = date;
        this.commissionValue=commissionValue;
    }

    /**
     * Get Advertisements with Property Filters
     * @param keepBusinessType Advertisement Business Type
     * @param keepPropertyType Advertisement Property Type
     * @param keepNumberBedrooms Advertisement Numver of Bedrooms
     * @return boolean
     */
    public Boolean getAdsAndPropertyFilters(BusinessType keepBusinessType, PropertyType keepPropertyType,int keepNumberBedrooms){
        if(keepBusinessType!=request.getBusinessType()){
            return false;
        }
        if(keepPropertyType!= request.getProperty().getPropertyType()){
            return false;
        }
        if(keepNumberBedrooms!=0){
            if(keepPropertyType.getDescription()=="APARTMENT"){
                if(((Building)request.getProperty()).getNumberBathrooms()!=keepNumberBedrooms){
                    return false;
                }
            }else if(keepPropertyType.getDescription()=="HOUSE"){
                if(((House)request.getProperty()).getNumberBathrooms()!=keepNumberBedrooms){
                    return false;
                }
            }
        }
        return true;
    }
}