package AAA_Project.domain;

import AAA_Project.utils.Email;

import java.util.Date;

public class RequestDTO {
    private Date date;


    private BusinessType businessType;


    private Property property;


    private int durationOfContract;


    private double salePrice;


    private double rentPrice;


    public RequestDTO(Property property, BusinessType businessType, int durationOfContract, double salePrice, double rentPrice) {
        if (!validateRequest(property, businessType, durationOfContract, salePrice, rentPrice))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.durationOfContract = durationOfContract;
        this.salePrice = salePrice;
        this.rentPrice = rentPrice;
        this.date = new Date();
    }


    private boolean validateRequest(Property property, BusinessType businessType, int durationOfContract, double salePrice, double rentPrice) {
        if (property == null || businessType == null)
            return false;
        /* if (businessType.getDescription().equals("rent"))
            if (durationOfContract <= 0 || rentPrice <= 0)
                return false;
        else if (businessType.getDescription().equals("sale"))
            if (salePrice <= 0)
                return false;
        else
            return false; */
        // Preciso de discutir com os outros para isto não perturbar o funcionamento das outras USs
        return true;
    }


    public Property getProperty() { return property;}
    public BusinessType getBusinessType() { return businessType;}
    public int getContractDuration() { return durationOfContract;}
    public double getSalePrice() { return salePrice;}
    public double getRentPrice() { return rentPrice;}
    public String getDate() { return date.toString();}

    public RequestDTO(Property property, BusinessType businessType, Employee agent, double salePrice) {
        if (!validateRequestSale(property, businessType, salePrice))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;

        this.salePrice = salePrice;
        this.date = new Date();
    }


    private boolean validateRequestSale(Property property, BusinessType businessType, double salePrice) {
        return property != null && businessType != null;
    }

    public RequestDTO(Property property, BusinessType businessType, double rentPrice, int durationOfContract) {
        if (!validateRequestRent(property, businessType, rentPrice, durationOfContract))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.salePrice = salePrice;
        this.date = new Date();
    }


    private boolean validateRequestRent(Property property, BusinessType businessType, double salePrice, int durationOfContract) {
        return property != null && businessType != null;
    }

}

