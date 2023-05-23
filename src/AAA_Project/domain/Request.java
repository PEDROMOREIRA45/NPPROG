package AAA_Project.domain;

import AAA_Project.utils.Email;

import java.util.Date;

public class Request {

    private Date date;


    private BusinessType businessType;


    private Property property;


    private Person owner;


    private Email userEmail;


    private Person agent;


    private int durationOfContract;


    private double salePrice;


    private double rentPrice;


    public Request(Property property, BusinessType businessType, Person owner, Employee agent, int durationOfContract, double salePrice, double rentPrice) {
        if (!validateRequest(property, businessType, owner, agent, durationOfContract, salePrice, rentPrice))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.owner = owner;
        this.agent = agent;
        this.durationOfContract = durationOfContract;
        this.salePrice = salePrice;
        this.rentPrice = rentPrice;
        this.date = new Date();
    }


    private boolean validateRequest(Property property, BusinessType businessType, Person owner, Person agent, int durationOfContract, double salePrice, double rentPrice) {
        if (property == null || businessType == null || owner == null || agent == null)
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

    public Request (Property property, BusinessType businessType, Person owner, Person agent, int durationOfContract, double salePrice, double rentPrice) {
        if (!validateRequest(property, businessType, owner, agent, durationOfContract, salePrice, rentPrice))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.owner = owner;
        this.agent = agent;
        this.durationOfContract = durationOfContract;
        this.salePrice = salePrice;
        this.rentPrice = rentPrice;
        this.date = new Date();
    }


    public Property getProperty() { return property;}
    public BusinessType getBusinessType() { return businessType;}
    public Person getOwner() { return owner;}
    public Person getAgent() { return agent;}
    public int getContractDuration() { return durationOfContract;}
    public double getSalePrice() { return salePrice;}
    public double getRentPrice() { return rentPrice;}
    public String getDate() { return date.toString();}

    public Request(Property property, Person owner, BusinessType businessType, Person agent, double salePrice) {
        if (!validateRequestSale(property, owner, businessType, agent, salePrice))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.agent = agent;
        this.salePrice = salePrice;
        this.date = new Date();
    }


    private boolean validateRequestSale(Property property, Person owner, BusinessType businessType, Person agent, double salePrice) {
        return property != null && businessType != null && agent != null;
    }

    public Request(Property property, Person owner, BusinessType businessType, Person agent, double salePrice, int durationOfContract) {
        if (!validateRequestRent(property, owner, businessType, agent, rentPrice, durationOfContract))
            throw new IllegalArgumentException("Request arguments are not valid, please try again.");
        this.property = property;
        this.businessType = businessType;
        this.agent = agent;
        this.salePrice = salePrice;
        this.date = new Date();
    }


    private boolean validateRequestRent(Property property, Person owner, BusinessType businessType, Person agent, double salePrice, int durationOfContract) {
        return property != null && businessType != null && agent != null;
    }

}
